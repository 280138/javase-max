package com.itheima.demo3genericity;

public interface Data<T>{
//    void add(Student s);//智能针对学生操作
    // 项目需要对学生/老师数据都要进行增删改查操作
    void add(T t);
    void delete(T t);
    void update(T t);
    T query(int id);

}
