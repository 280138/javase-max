package com.itheima.demo2threadapi;

public class ThreadApiDemo3 {
    public static void main(String[] args) {
        //目标：线程的join方法，线程插队，让调用的线程先执行完毕
        MyThread2 t1 = new MyThread2();
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "线程执行" + i);
            try {
                if (i == 1){
                    t1.join();//线程插队，让调用的线程先执行完毕
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

class MyThread2 extends Thread{
    //2、重写Thread类的run（）方法
    @Override
    public void run() {
        //3、在run（）方法中编写线程的任务代码
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "子线程执行" + i);
        }
    }
}
