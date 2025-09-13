package com.itheima.demo2map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapTraverseDemo3 {
    public static void main(String[] args) {

        //遍历方式三: Lambda
        Map<String,Integer> map = new HashMap<>();
        map.put("嫦娥",18);
        map.put("女儿国王",66);
        map.put("嫦娥",28);
        map.put("铁扇公主",38);
        map.put("紫霞",31);
        map.put("紫霞",31);
        map.put(null,null);
        System.out.println(map);//{null=null, 嫦娥=28, 铁扇公主=38, 紫霞=31, 女儿国王=66}

        //调用Map里面的foreach（）方法

//        map.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.println(s + "=" + integer);
//            }
//        });

        map.forEach((k,v) -> System.out.println(k + "=" + v));

    }
}
