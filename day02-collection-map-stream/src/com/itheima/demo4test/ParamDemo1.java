package com.itheima.demo4test;

import java.util.Arrays;

public class ParamDemo1 {
    public static void main(String[] args) {
        //目标：认识可变参数
        //可变参数的格式：数据类型...变量名
        sum(); //可变参数可以不传递参数
        sum(10);
        sum(10,29,39,59);  //可变参数可以传递多个参数
        sum(new int[]{10,29,39,59}); //可变参数可以传递数组
    }

    //优势：灵活接收参数，可以替代数组传参

    //注意：可变参数在形参列表中只能有一个，并只能放在形参列表最后
    public static void sum(int... nums){
        //可变参数在方法内部就是一个数组，nums就是数组
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("----------------------------------------");
    }
}
