package com.itheima.demo1create;

public class ThreadDemo1 {
    //main方法本身就是一条主线程负责推荐执行的
    public static void main(String[] args) {
        //目标： 创建多线程方式一：继承Thread类

        //4、创建线程类的对象
        Thread t = new MyThread();
        //5、调用start（）方法启动线程。
        //注意：直接调用run方法会当成普通方法来跑，相当于此时还是单线程运行，只有调用start方法才是启动一个新线程
        t.start();//启动线程，让线程执行run（）方法

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行" + i);
        }
    }
}

//1、定义一个子类继承Thread类
class MyThread extends Thread{
    //2、重写Thread类的run（）方法
    @Override
    public void run() {
        //3、在run（）方法中编写线程的任务代码
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行" + i);
        }
    }
}
