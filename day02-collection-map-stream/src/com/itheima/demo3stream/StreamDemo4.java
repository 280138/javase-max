package com.itheima.demo3stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamDemo4 {
    public static void main(String[] args) {
        //目标：掌握Stream流的统计，收集操作（终结方法）
        List<Teacher > teachers = new ArrayList<>();
        teachers.add(new Teacher("小王", 18, 5000));
        teachers.add(new Teacher("小张", 19, 6000));
        teachers.add(new Teacher("小张", 19, 8000));
        teachers.add(new Teacher("小张", 19, 10000));
        teachers.add(new Teacher("小李", 20, 7000));
        teachers.add(new Teacher("小王", 18, 5000));

        teachers.stream().filter(t -> t.getSalary() > 6000).forEach(System.out::println);
        System.out.println("----------------------------------------------------------------");
        long count = teachers.stream().filter(t -> t.getSalary() > 6000).count();
        System.out.println(count);
        System.out.println("----------------------------------------------------------------");
        //获取薪水最大的老师用max
        Optional<Teacher> max = teachers.stream().max((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
        Teacher maxteacher = max.get();
        System.out.println(maxteacher);
        System.out.println("----------------------------------------------------------------");
        //获取薪水最小的老师用min
        Teacher min = teachers.stream().min((a, b) -> Double.compare(a.getSalary(), b.getSalary())).get();
        System.out.println(min);

    }
}
