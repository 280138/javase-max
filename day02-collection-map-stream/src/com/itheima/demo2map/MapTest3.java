package com.itheima.demo2map;

import java.util.*;

public class MapTest3 {
    public static void main(String[] args) {
        calc();
    }

    private static void calc() {
        //1、把80个学生选择的经典拿到程序中
        List<String> locations = new ArrayList<>();
        String[] names = {"雪山","长城","少林寺","丽江"};
        Random r = new Random();
        for (int i = 0; i <= 80; i++) {
            int index = r.nextInt(names.length); //随机数范围[0,4)的整数
            locations.add(names[index]);
        }
        System.out.println(locations);

        //2、统计每个景点被选择的次数

        //统计结果是键值对形式，定义Map集合来统计结果
        Map<String,Integer> map = new HashMap<>();

        //遍历集合，统计选择次数
        for (String location : locations) {
            //判断map集合中是否有该景点
//            if(map.containsKey(location)){
//                map.put(location, map.get(location)+1);
//            }else {
//                map.put(location,1);
//            }
            map.put(location,map.containsKey(location) ? map.get(location) + 1 : 1);
        }

//        System.out.println(map);
        map.forEach((k,v)-> System.out.println(k+"被选择的次数是："+v));
    }
}
