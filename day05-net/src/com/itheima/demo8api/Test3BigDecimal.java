package com.itheima.demo8api;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test3BigDecimal {
    public static void main(String[] args) {
        //目标：掌握BigDecimal解决小数运算结果失真问题
        double a = 0.1;
        double b = 0.2;
        System.out.println(a+b);//0.30000000000000004

        //用 public BigDecimal(String val){}字符串构造器才能解决失真问题
//        BigDecimal a1 = new BigDecimal(Double.toString(a));
//        BigDecimal b1 = new BigDecimal(Double.toString(b));

        //用valueOf方法优化，内部使用publicDecimal(String val)字符串构造器
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1);
        double result = c1.doubleValue();
        System.out.println(result);

        BigDecimal i = BigDecimal.valueOf(0.1);
        BigDecimal j = BigDecimal.valueOf(0.3);
        BigDecimal k = i.divide(j, 2, RoundingMode.HALF_UP);
        System.out.println(k);

    }
}
