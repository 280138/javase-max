package com.itheima.demo4test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        //目标：Collections工具类
        List<String> list = new ArrayList<>();
//        list.add("小昭");
//        list.add("张无忌");
//        list.add("赵敏");
//        list.add("宋青书");
//        list.add("赵敏");
//        list.add("张三丰");

        //1、用Collections的方法批量加
        Collections.addAll(list,"小昭","张无忌","赵敏","宋青书","赵敏","张三丰");
        System.out.println(list);

        //2、打乱顺序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
