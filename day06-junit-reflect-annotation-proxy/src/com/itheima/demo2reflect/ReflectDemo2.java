package com.itheima.demo2reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo2 {
    //目标：获取类的信息
    public static void main(String[] args) throws Exception {
        //1、反射第一步：获取Class对象
        Class c1 = Student.class;
        System.out.println(c1);
        System.out.println(c1.getName());//类的全类名 com.itheima.demo2reflect.Student
        System.out.println(c1.getSimpleName());//类名 Student

        System.out.println("---------------------");
        //1、加载类，拿到类对象
        Class<Dog> c2 = Dog.class;
        //2、获取类的构造器对象并对其进行操作
        Constructor[] cons = c2.getDeclaredConstructors();
        for (Constructor con : cons) {
            System.out.println(con.getName() + " (" + con.getParameterCount() );
        }
        System.out.println("---------------------");

        //3、获取单个构造器
        Constructor con = c2.getDeclaredConstructor();//无参构造器
        System.out.println(con.getName() + "(" + con.getParameterCount());

        Constructor con2 = c2.getDeclaredConstructor(String.class, int.class);
        System.out.println(con2.getName() + "(" + con2.getParameterCount());

        //4、获取构造器的作用： 创建对象
        con.setAccessible(true);//暴力反射可以访问私有的
        Dog d1 = (Dog) con.newInstance();//强转，不然是object,不能调用独有功能
        System.out.println(d1);

        Dog d2 = (Dog) con2.newInstance("小黑", 3);
        System.out.println(d2);

        //获取类的成员变量
        System.out.println("---------------------------");
        Class c3 = Dog.class;
        Field[] fields = c3.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "(" + field.getType().getName());
        }
        //获取单个成员变量
        Field field = c3.getDeclaredField("hobby");
        System.out.println(field.getName() + "(" + field.getType().getName());
        //获取成员变量的目的：取值和赋值
        Dog d = new Dog("泰迪",3);
        field.setAccessible(true);//"hobby"这个field是private==>暴力访问
        field.set(d,"社交");//d.setHobby("社交")
        System.out.println(d);

        String hobby = (String) field.get(d);
        System.out.println(hobby);

        System.out.println("-----------------------------");

        //获取类的成员方法
        Class<Dog> c4 = Dog.class;
        Method[] methods = c4.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "(" + method.getParameterCount());
        }
        //获取单个成员方法
        Method eat = c4.getDeclaredMethod("eat");//获取的是无参数的eat方法
        Method eat2 = c4.getDeclaredMethod("eat", String.class);//获取的是有参数的eat方法
        System.out.println(eat.getName() + "(" + eat.getParameterCount());
        System.out.println(eat2.getName() + "(" + eat2.getParameterCount());

        //获取成员方法的目的：调用方法
        //Dog d = new Dog("泰迪"，3);
        eat.setAccessible(true);
        Object rs1 = eat.invoke(d);//调用对象d的eat方法执行，相当于 d.eat()
        System.out.println(rs1);//null
        Object rs2 = eat2.invoke(d, "牛肉");//调用对象d的带String参数的eat方法执行，相当于 d.eat(“牛肉”)
        System.out.println(rs2);
    }
}
