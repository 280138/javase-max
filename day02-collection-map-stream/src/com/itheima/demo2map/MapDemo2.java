package com.itheima.demo2map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        //目标：掌握Map的常用方法
        Map<String,Integer> map = new HashMap<>();//一行经典代码
        map.put("嫦娥",18);
        map.put("女儿国王",66);
        map.put("嫦娥",28);
        map.put("铁扇公主",38);
        map.put("紫霞",31);
        map.put("紫霞",31);
        map.put(null,null);
        System.out.println(map);//{null=null, 嫦娥=28, 铁扇公主=38, 紫霞=31, 女儿国王=66}

        //写代码演示常用方法
        System.out.println(map.get("嫦娥"));//28
        System.out.println(map.get("紫霞"));//31
        System.out.println(map.get("白羊"));//null
        System.out.println(map.containsKey("嫦娥"));// true
        System.out.println(map.containsValue(66));// true
        System.out.println(map.containsValue(66));// true
        System.out.println(map.isEmpty());// false
        System.out.println(map.size());// 5
        System.out.println(map.remove("嫦娥"));// 28
        System.out.println(map.remove("嫦娥"));// null
        System.out.println(map.size());// 4
        //map.clear();// 清空
        System.out.println(map.isEmpty());//false

    }
}
