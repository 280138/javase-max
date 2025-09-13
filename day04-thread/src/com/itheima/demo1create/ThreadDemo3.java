package com.itheima.demo1create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) {
        //目标：创建多线程方式三：实现Collable接口，获取结果

        //3、创建Callable接口的实现类对象
        Callable<String> c1 = new MyCallable(100);
        //4、把Callable对象封装成真正的线程任务对象FutureTask对象
        /**
         * 未来任务对象的作用：
         *  1、本质是一个Runnable线程任务对象，可以交给Thread线程对象来处理
         *  2、可以获取线程执行结果
         */
        FutureTask<String> ft1 = new FutureTask<>(c1);
        //5、把线程任务对象交给一个线程对象来处理
        Thread t1 = new Thread(ft1);
        //6、启动线程
        t1.start();

        Callable<String> c2 = new MyCallable(100);
        FutureTask<String> ft2 = new FutureTask<>(c2);
        Thread t2 = new Thread(ft2);
        t2.start();

        //7、获取线程执行结果
        try {
            //如果主线程发现第一个线程还没有执行完毕，会让出CPU，等第一个线程执行完毕，再获取结果
            System.out.println(ft1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            //如果主线程发现第一个线程还没有执行完毕，会让出CPU，等第一个线程执行完毕，再获取结果
            System.out.println(ft2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//1、定义一个实现类实现Callable接口
class MyCallable implements Callable<String>{
    private int n ;
    public MyCallable(int n){
        this.n = n;
    }
    //2、重写call方法，定义线程执行体
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        return  "子线程计算1-” + n + “的和是" + sum;
    }
}