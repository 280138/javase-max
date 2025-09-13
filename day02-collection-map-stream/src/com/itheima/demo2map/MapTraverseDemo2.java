package com.itheima.demo2map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTraverseDemo2 {
    public static void main(String[] args) {

        //(源码)遍历方式二: 把“键值对”看作一个整体进行遍历
        Map<String,Integer> map = new HashMap<>();
        map.put("嫦娥",18);
        map.put("女儿国王",66);
        map.put("嫦娥",28);
        map.put("铁扇公主",38);
        map.put("紫霞",31);
        map.put("紫霞",31);
        map.put(null,null);
        System.out.println(map);//{null=null, 嫦娥=28, 铁扇公主=38, 紫霞=31, 女儿国王=66}

        //调用Map里面的entrySet()方法
        //把Map集合转成Set集合，Set集合里面的元素类型都是键值对类型<Map.Entry<String,Integer>>
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
