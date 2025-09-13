package com.itheima.demo6collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTraversalDemo4 {
    public static void main(String[] args) {
        //目标：掌握Collection的遍历方式二：增强for循环遍历
        //增强for循环遍历既可以遍历数组，也可以遍历集合
        ArrayList<String> names = new ArrayList<>();
        names.add("小昭");
        names.add("张无忌");
        names.add("赵敏");
        names.add("宋青书");
        System.out.println(names);//[小昭, 张无忌, 赵敏, 宋青书]

        for (String name : names) {
            System.out.println(name);
        }

        String[] users = {"小昭", "张无忌", "赵敏", "宋青书"};
        for (String user : users) {
            System.out.println(user);
        }
    }
}
