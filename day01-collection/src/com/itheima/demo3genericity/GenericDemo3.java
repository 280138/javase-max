package com.itheima.demo3genericity;

public class GenericDemo3 {
    public static void main(String[] args) {
        //目标：搞清楚泛型接口的基本应用
        StudentData studentData = new StudentData();
        studentData.add(new Student());
        studentData.delete(new Student());
        Student s = studentData.query(1);
    }
}
