package com.itheima.demo6collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionTraversalTest6 {
    public static void main(String[] args) {
        //目标：认识并发修改异常问题，搞清楚每种遍历的区别
        //并发修改异常问题的方案：
        // 1、如果集合支持索引，可以使用for循环遍历，每删除数据后做i--;或则倒着遍历
        // 2、使用迭代器遍历集合,并用迭代器提供的删除方法删除数据
        //增强for循环/Lambda遍历均不能解决并发修改异常问题，因此他们只适合做数据的遍历，不适合同时做增删操作


        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特俗枸杞");
        list.add("枸杞子");
        list.add("西洋参");
        System.out.println(list);
        //[Java入门, 宁夏枸杞, 黑枸杞, 人字拖, 特俗枸杞, 枸杞子, 西洋参]

        //需求1：删除全部枸杞
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (name.contains("枸杞")) {
                list.remove(name);
            }
        }
        System.out.println(list);//出现并发修改异常[Java入门, 黑枸杞, 人字拖, 枸杞子, 西洋参]
        System.out.println("===============================");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java入门");
        list2.add("宁夏枸杞");
        list2.add("黑枸杞");
        list2.add("人字拖");
        list2.add("特俗枸杞");
        list2.add("枸杞子");
        list2.add("西洋参");
        System.out.println(list2);
        //[Java入门, 宁夏枸杞, 黑枸杞, 人字拖, 特俗枸杞, 枸杞子, 西洋参]

        //需求1：删除全部枸杞
        //解决方案1：删除数据后i--（前提是支持索引）
        for (int i = 0; i < list2.size(); i++) {
            String name = list2.get(i);
            if (name.contains("枸杞")) {
                list2.remove(name);
                i--;
            }
        }
        System.out.println(list2);
        System.out.println("===============================");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Java入门");
        list3.add("宁夏枸杞");
        list3.add("黑枸杞");
        list3.add("人字拖");
        list3.add("特俗枸杞");
        list3.add("枸杞子");
        list3.add("西洋参");
        System.out.println(list3);
        //[Java入门, 宁夏枸杞, 黑枸杞, 人字拖, 特俗枸杞, 枸杞子, 西洋参]

        //需求1：删除全部枸杞
        //解决方案2：倒着遍历并删除（前提是支持索引）
        for (int i = list3.size() - 1; i >= 0; i--) {
            String name = list3.get(i);
            if (name.contains("枸杞")) {
                list3.remove(name);
            }
        }
        System.out.println(list3);

        System.out.println("===============================");
        Collection<String> list4 = new ArrayList<>();
        list4.add("Java入门");
        list4.add("宁夏枸杞");
        list4.add("黑枸杞");
        list4.add("人字拖");
        list4.add("特俗枸杞");
        list4.add("枸杞子");
        list4.add("西洋参");
        System.out.println(list4);
        //[Java入门, 宁夏枸杞, 黑枸杞, 人字拖, 特俗枸杞, 枸杞子, 西洋参]

        //需求1：删除全部枸杞  （没索引）
        //方案一：迭代器遍历并删除 默认也存在并发修改异常问题
        Iterator<String> it = list4.iterator();
        while (it.hasNext()){
            String name = it.next();
            if (name.contains("枸杞")){
                it.remove();
            }
        }
        System.out.println(list4);

        System.out.println("===============================");
        Collection<String> list5 = new ArrayList<>();
        list5.add("Java入门");
        list5.add("宁夏枸杞");
        list5.add("黑枸杞");
        list5.add("人字拖");
        list5.add("特俗枸杞");
        list5.add("枸杞子");
        list5.add("西洋参");
        System.out.println(list5);
        //[Java入门, 宁夏枸杞, 黑枸杞, 人字拖, 特俗枸杞, 枸杞子, 西洋参]

        //需求1：删除全部枸杞   （没索引）
        //方案二和三：用增强for和Lambda(都没有解决并发修改异常问题)
        //结论：增强for和Lambda只适合遍历集合，不适合做遍历并修改
//        for (String s : list5) {
//            if (s.contains("枸杞")) {
//                list5.remove(s);
//            }
//        }

        //Lambda
//        list5.forEach(s-> {
//            if (s.contains("枸杞")) {
//                list5.remove(s);
//            }
//        });
        System.out.println(list5);
    }
}
