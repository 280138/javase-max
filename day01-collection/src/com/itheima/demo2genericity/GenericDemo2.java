package com.itheima.demo2genericity;

import java.util.ArrayList;

public class GenericDemo2 {
    public static void main(String[] args) {
        //目标：学会自定义泛型类
        //需求：模拟ArrayList集合自定义一个集合MyArrayList
        MyArrayList<String> myArraylist = new MyArrayList<>();
        myArraylist.add("Hello");
        myArraylist.add("World");
//        myArraylist.add(555); 报错
        myArraylist.add("java");
        myArraylist.add("前端");
        System.out.println(myArraylist.remove("Hello"));
        System.out.println(myArraylist);
    }
}
