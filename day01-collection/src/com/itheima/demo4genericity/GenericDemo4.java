package com.itheima.demo4genericity;

import com.itheima.demo3genericity.Student;

public class GenericDemo4 {
    public static void main(String[] args) {
        //目标：学会 定义 泛型方法
        // 格式： 修饰符 <类型> 返回值类型 方法名（类型 变量名）{}
        //       public <T> void show(T t){}

        String[] names = {"赵敏", "小昭", "小華","张无忌"};
        printArray(names);

        Student[] stus = new Student[3];
        printArray(stus);

        Student max = getMax(stus);
        String max2 = getMax(names);
    }

    //声明泛型方法
    public static <T> void printArray(T[] names){
    }
//    public static void printArray(String[] names){
//    }                 改方法不能传入学生类型，要定义成泛型方法

    public static  <T> T  getMax(T[] names){
        return null;
    }

//  public static <T> void getMax(T[] names){}
}
