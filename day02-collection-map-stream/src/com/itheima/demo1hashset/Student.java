package com.itheima.demo1hashset;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int id;

    //只要两个对象的内容一样结果一定是true
    //s1.equals(s3)
    //this == s3
    @Override
    public boolean equals(Object o) {
        //1、如果是自己和自己比直接返回true
        if (this == o) return true;
        //2、如果o为空或者o不是Student类型，直接返回false
        if (o == null || getClass() != o.getClass()) return false;
        //3、比较两个对象的内容是否一样
        Student student = (Student) o;
        return age == student.age && id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        //包含不同学生对象，如果内容一样返回的哈希值一定是一样的
        return Objects.hash(name, age, id);
    }

    //---------------------------------------------------------
    public Student(String name, int age, int id)
    {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public Student(){}

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}'+ '\n';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
