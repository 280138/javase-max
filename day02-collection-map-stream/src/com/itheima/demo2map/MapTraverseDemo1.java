package com.itheima.demo2map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTraverseDemo1 {
    public static void main(String[] args) {

        //遍历方式一: 根据“键”取“值”
        Map<String,Integer> map = new HashMap<>();
        map.put("嫦娥",18);
        map.put("女儿国王",66);
        map.put("嫦娥",28);
        map.put("铁扇公主",38);
        map.put("紫霞",31);
        map.put("紫霞",31);
        map.put(null,null);
        System.out.println(map);//{null=null, 嫦娥=28, 铁扇公主=38, 紫霞=31, 女儿国王=66}

        //keySet()方法返回的是Set集合
        //public Set<k> keySet()   api里面的方法
        Set<String> keys = map.keySet();
        for (String key : keys) {
            //public V get(k key)
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
//        for (String key : map.keySet()) {
//            Integer value = map.get(key);
//            System.out.println(key + "=" + value);
//        }

        Collection<Integer> values = map.values();
        //为什么用Cellection不用Set是因为值有可能重复，而Set不重复
        for (Integer value : values) {
            System.out.println(value);
        }

    }
}
