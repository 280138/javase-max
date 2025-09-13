package com.itheima.demo2genericity;

import java.util.ArrayList;

public class GenericDemo1 {
    //泛型类，泛型接口，泛型方法
    public static void main(String[] args) {
        //目标：（泛型类）掌握ArrayList集合的基本使用
//1、集合是一种容器，用来存储数据 2、集合的长度是动态的 3、ArrayList是泛型类，可以约束存储的数据类型
//数组定义完后，长度就固定了，不能动态扩容,而集合的长度是动态的，可以动态扩容
        //创建ArrayList集合对象，代表一个集合容器
        ArrayList<String> list = new ArrayList<>();//泛型定义集合 <贴标签>
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("zyc");
//        list.add(34);   贴标签以后就报错
//        list.add(5.5);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println("=============================");
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        //删除数据
        System.out.println("=================================");
        System.out.println(list.remove(1));//删除指定处元素，返回被删除的元素
        System.out.println(list);
        System.out.println(list.remove("zyc"));//返回true False
        System.out.println(list);
        //修改数据
        list.set(0, "yyyy");
        System.out.println(list);

    }
}
