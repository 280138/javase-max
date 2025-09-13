package com.itheima.demo1hashset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {

    //结论：TreeSet集合默认不能给自定义对象排序，因为不知道大小规则
    //两种方案
    //1、对象类实现一个Comparable比较接口，重写compareTo方法，制定大小比较规则
    //2、用TreeSet集合的有参构造器，设置Comparator对象，制定大小比较规则
    public static void main(String[] args) {
        //目标：搞清楚TreeSet集合对于自定义对象的排序
        Set<Teacher> teachers = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
//                return o2.getAge() - o1.getAge();//降序
//                return (int) (o1.getSalary() - o2.getSalary());强转风险：丢失精度，如120与120.6排

//                if (o1.getSalary() > o2.getSalary()){
//                    return 1;
//                } else if (o1.getSalary() < o2.getSalary()) {
//                    return -1;
//                }
//                return 0;

                //用包装类
                return Double.compare(o2.getSalary(), o1.getSalary());//薪水降序
            }
        });//排序，不重复，无索引

//        Set<Teacher> teachers = new TreeSet<>((o1, o2) -> Double.compare(o2.getSalary(), o1.getSalary()));//排序，不重复，无索引

//        Set<Teacher> teachers = new TreeSet<>() ;
        teachers.add(new Teacher("小王",18,6000));
        teachers.add(new Teacher("dlei",20,3000));
        teachers.add(new Teacher("老王",20,5000));
        teachers.add(new Teacher("老李",23,8000));
        System.out.println(teachers);

    }
}
