package com.itheima.demo2reflect;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        //目标：搞清楚反射的应用：做框架的通用技术
        Dog d = new Dog("小黑",3);
        SaveObjectFrame.saveObject(d);
        Student s = new Student("小明",18,"爱问问题");
        SaveObjectFrame.saveObject(s);
        Teacher t = new Teacher("小红",19,"看报纸",3000,"422期",'女',"19920445028");
        SaveObjectFrame.saveObject(t);

    }
}
