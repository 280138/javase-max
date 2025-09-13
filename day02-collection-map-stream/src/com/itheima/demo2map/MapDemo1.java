package com.itheima.demo2map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        //目标：认识Map集合
        //Map特点/HashMap特点:无序，不重复，无索引，键值对都可以是null，值可以重复
        //LinkedMap特点：有序，不重复，无索引，键值对都可以是null，值可以重复
        //TreeMap特点:按照键可排序，不重复，无索引
        Map<String,Integer> map = new LinkedHashMap<>();//一行经典代码
        map.put("嫦娥",18);
        map.put("女儿国王",66);
        map.put("嫦娥",28);
        map.put("铁扇公主",38);
        map.put("紫霞",31);
        map.put("紫霞",31);
        map.put(null,null);
        System.out.println(map);//{null=null, 嫦娥=28, 铁扇公主=38, 紫霞=31, 女儿国王=66}
    }
}
