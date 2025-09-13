package com.itheima.demo1hashset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher implements Comparable<Teacher>{
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}' + "\n";
    }

    //1、对象类实现一个Comparable比较接口，重写compareTo方法，制定大小比较规则
    //t2.compareTo(t1)
    // t2 == this 比较者
    // t1 == o 被比较者
    // 规定1：如果你认为左边大于右边，则返回正数，排在前面
    // 规定2：如果你认为左边小于右边，则返回负数，排在后面
    //规定3：如果你认为两边相等，则返回0
    //默认就会升序
    //java默认左边为主调对象this，默认右边为从调对象o，返回正数时，默认的主调对象后移，升序排序
    @Override
    public int compareTo(Teacher o) {   //在TreeSet集合中加入数据会被调用
        //按照年龄升序
//        if (this.getAge() > o.getAge()) return 1;
//        if (this.getAge() < o.getAge()) return -1;
//        return 1;
        return this.getAge() - o.getAge();//升序
    }
}
