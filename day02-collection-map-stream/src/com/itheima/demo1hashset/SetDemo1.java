package com.itheima.demo1hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        //目标：理解Set集合存储元素特点
        //HashSet：无序，不重复，无索引
        Set<String> hashSetset = new HashSet<>();//经典代码
        hashSetset.add("java");
        hashSetset.add("java");
        hashSetset.add("鸿蒙");
        hashSetset.add("鸿蒙");
        hashSetset.add("电商设计");
        hashSetset.add("电商设计");
        hashSetset.add("新媒体");
        hashSetset.add("大数据");
        hashSetset.add("人工智能");
        System.out.println(hashSetset);//[java, 新媒体, 人工智能, 鸿蒙, 电商设计, 大数据]
        //等价写法：System.out.println(s) 与 System.out.println(s.toString()) 是完全等价的
        //输出格式：默认的 toString() 返回格式为：类名@哈希码（例如：com.itheima.demo1hashset.Student@1b6d3586）
//        hashset.get()  无索引

        //LinkedHashSet：有序，不重复，无索引
        Set<String> linkedhashset = new LinkedHashSet<>();//经典代码
        linkedhashset.add("java");
        linkedhashset.add("java");
        linkedhashset.add("鸿蒙");
        linkedhashset.add("鸿蒙");
        linkedhashset.add("电商设计");
        linkedhashset.add("电商设计");
        linkedhashset.add("新媒体");
        linkedhashset.add("大数据");
        linkedhashset.add("人工智能");
        System.out.println(linkedhashset);//[java, 鸿蒙, 电商设计, 新媒体, 大数据, 人工智能]

        //TreeSet：排序（默认升序），不重复，无索引
        Set<Double> treeSet = new TreeSet<>();
        treeSet.add(3.14);
        treeSet.add(5.0);
        treeSet.add(2.0);
        treeSet.add(1.0);
        treeSet.add(4.0);
        System.out.println(treeSet);

        System.out.println("--------------------------------------");
        Student s = new Student("zyc",22,2024);
        System.out.println(s.hashCode());
        System.out.println(s);


    }
}
