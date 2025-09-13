package com.itheima.demo1create;

public class ThreadDemo2_2 {
    public static void main(String[] args) {
        //目标：创建多线程方式二：匿名内部类实现Runnable接口

        Runnable r = new MyRunnable();
        Thread t1 = new Thread(r);//public Thread(Runnable target)
        t1.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程2执行" + i);
                }
            }
        }).start();

        new Thread(() ->{
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程3执行" + i);
                }
            }
        ).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行" + i);
        }

    }
}



