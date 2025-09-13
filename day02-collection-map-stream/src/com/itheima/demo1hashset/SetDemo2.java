package com.itheima.demo1hashset;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        //目标：掌握HashSet集合去重操作
        //如果希望Set集合认为2个内容相同的对象是重复的，就重写对象的hashCode()和equeals()方法
        Student s1 = new Student("小王", 18, 1);
        Student s2 = new Student("小王", 18, 1);
        Student s3 = new Student("大李", 22, 3);
        Student s4 = new Student("大李", 22, 3);

        Set<Student> set = new HashSet<>();//不重复的！
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);

    }
}
