package com.itheima.demo3stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        //目标： Stream流的收集
        List<String> list = new ArrayList<>();
        list.add("小昭");
        list.add("张无忌");
        list.add("赵敏");
        list.add("宋青书");
        list.add("赵敏");
        list.add("张三丰");
        list.add("张三丰");
        list.add("张为民");

        //收集到集合或者数组中去
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        //收集到List集合
        List<String> list1 = s1.collect(Collectors.toList());
        System.out.println(list1);

//        //收集到Set集合----------会报错，因为流只能收集一次
//        Set<String> set = s1.collect(Collectors.toSet());
//        System.out.println(set);

//        把list1中元素全部倒进set2
//        //收集到Set集合
//        Set<String> set2 = new HashSet<>();
//        list1.addAll(set2);

        //收集到Set集合(再收集一次)
        Stream<String> s2 = list.stream().filter(s -> s.startsWith("张"));
        Set<String> set = s2.collect(Collectors.toSet());
        System.out.println(set);

        //收集到数组中
        Stream<String> s3 = list.stream().filter(s -> s.startsWith("张"));
        Object[] array = s3.toArray();
        System.out.println(Arrays.toString(array));

        System.out.println("------------------收集到Map集合中-----------------");

        List<Teacher > teachers = new ArrayList<>();
        teachers.add(new Teacher("小王", 18, 5000));
        teachers.add(new Teacher("小张", 19, 6000));
        teachers.add(new Teacher("小张", 19, 8000));
        teachers.add(new Teacher("小张", 19, 10000));
        teachers.add(new Teacher("小李", 20, 7000));
        teachers.add(new Teacher("小王", 18, 5000));

        //收集到Map集合中:键是老师名称，值是老师薪水
        Map<String, Double> map = teachers.stream().collect(Collectors.toMap(Teacher::getName, Teacher::getSalary));
        System.out.println(map);


    }
}
