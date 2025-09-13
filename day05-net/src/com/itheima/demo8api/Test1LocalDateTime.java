package com.itheima.demo8api;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test1LocalDateTime {
    public static void main(String[] args) {
        //目标：掌握java提供的获取时间的方案
        //jdk8 以前的方案： Data获取此时日期时间 老项目
        Date d = new Date();
        System.out.println(d);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        String result = sdf.format(d);
        System.out.println(result);

        //jdk8之后的方案： LocalData LocalTime LocalDateTime

        //获取此刻日期时间对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getDayOfYear());

        LocalDateTime now2 = now.plusSeconds(60);//60秒后
        System.out.println(now);
        System.out.println(now2);

        //格式化DateTimeFormatter
        //1、创建一个格式化对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd/ HH:mm:ss a");
        System.out.println(dtf.format(now));
        System.out.println(result);

    }
}
