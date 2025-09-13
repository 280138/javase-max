package com.itheima.demo3stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        //目标： 认识Stream流
        List<String> list = new ArrayList<>();
        list.add("小昭");
        list.add("张无忌");
        list.add("赵敏");
        list.add("宋青书");
        list.add("赵敏");
        list.add("张三丰");
        list.add("张为民");

        //1、传统方案： 找出姓张的人，名字为3个字的。存入到一个新集合中去
        List<String> newList = new ArrayList<>();
        for (String name : list){
            if (name.startsWith("张")&&name.length()==3){
                newList.add(name);
            }
        }
        System.out.println(newList);

        //2、Stream流方案：
        List<String> newList2 = list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).collect(Collectors.toList());
        System.out.println(newList2);
    }
}
