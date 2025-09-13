package com.itheima.demo3stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        //目标：掌握Stream提供的常用的中间方法
        List<String> list = new ArrayList<>();
        list.add("小昭");
        list.add("张无忌");
        list.add("赵敏");
        list.add("宋青书");
        list.add("赵敏");
        list.add("张三丰");
        list.add("张为民");

        //1、过滤方法
        list.stream().filter(s -> s.startsWith("张") && s.length() == 3).forEach(System.out::println);

        //2、排序方法
        List<Double> list2 = new ArrayList<>();
        list2.add(7.5);
        list2.add(9.5);
        list2.add(5.5);
        list2.add(5.5);
        list2.add(8.5);

        list2.stream().sorted().forEach(System.out::println);//升序
        System.out.println("-----------------------------------------------");
        list2.stream().sorted(((o1, o2) -> Double.compare(o2, o1))).forEach(System.out::println);//降序
        System.out.println("-----------------------------------------------");
        list2.stream().sorted(((o1, o2) -> Double.compare(o2, o1))).limit(2).forEach(System.out::println);//取前2个
        System.out.println("-----------------------------------------------");
        list2.stream().sorted(((o1, o2) -> Double.compare(o2, o1))).skip(2).forEach(System.out::println);//取前2个
        System.out.println("-----------------------------------------------");
        //如果希望自定义对象能够去重复，要重写对象的hashcode()和equals()方法
        list2.stream().sorted(((o1, o2) -> Double.compare(o2, o1))).distinct().forEach(System.out::println);//去重
        System.out.println("-----------------------------------------------");

        //3、映射/加工方法： 把流上原来的数据拿出来变成新数据又放到流上去
        list2.stream().map(s -> "加10分后:" +  (s + 10)).forEach(System.out::println);

        //合并流
        Stream<String> s1 = Stream.of("张三丰", "张无忌", "张翠山", "张良", "张为民");
        Stream<Integer> s2 = Stream.of(111,222,333,666);
        Stream<Object> s3 = Stream.concat(s1, s2); //注意Object是String和Integer的父类
        System.out.println(s3.count());

    }
}
