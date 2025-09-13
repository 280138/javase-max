package com.itheima.demo5genericity;

import java.util.ArrayList;

public class GenericDemo6 {
    public static void main(String[] args) {
        //为什么要有包装类？为了万物皆对象，让基本数据类型进入对象家族
        //泛型和集合不支持基本数据类型（8），只能支持对象类型（引用数据类型
        //泛型擦除：泛型工作在编译时期，泛型会进行类型擦除，将泛型替换为Object，Object是对象类型只能指向对象
        //（int->Integer,char->Character）

        //包装类 把 基本数据类型 ==> 包装类对象
        //手工包装：
        //Integer it1 = new Integer(100);
        Integer it1 = Integer.valueOf(100);//推荐的
        Integer it2 = Integer.valueOf(100);
        System.out.println(it1 == it2);

        //自动装箱成对象：基本数据类型的数据可以直接变成包装对象的数据，不需要做额外任何
        Integer it = 100;
        Integer it3 = 130;
        System.out.println(it == it3);

        //自动拆箱：把包装类型的对象直接给基本类型的数据
        int i = it3;
        System.out.println(i);

        System.out.println("---------------------------------");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(110));//手动装箱
        list.add(100);//自动装箱
        int rs = list.get(1);//自动拆箱
        System.out.println("---------------------------------");

        //包装类新增的功能：
        //1、把基本类型的数据转换成字符串：
        int j = 23;
        String rs1 = Integer.toString(j);//"23"
        System.out.println(rs1 + 1);//231

        Integer i2 = j;
        String rs2 = i2.toString();
        System.out.println(rs2 + 1);

        String rs3 = i2 + "";
        System.out.println(rs3 + 1);
        System.out.println("---------------------------------");

        //2、把字符串转换成基本数据类型：(!认可！)
        String str = "98";
        //int i1 = Integer.paeseInt(str);  //用parseInt()转
        int i1 = Integer.valueOf(str);   //用valueOf()转
        System.out.println(i1 + 2);

        String str2 = "98.9";
        //double d = Double.parseDouble(str2); //用parseDouble()转
        double d = Double.valueOf(str2);    //用valueOf()转
        System.out.println(d + 2);
    }
}
