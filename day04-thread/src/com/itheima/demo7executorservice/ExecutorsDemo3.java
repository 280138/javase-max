package com.itheima.demo7executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsDemo3 {
    public static void main(String[] args) {
        //目标： 通过线程池工具类：Executors.调用静态方法创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);

        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(100));
        Future<String> f3 = pool.submit(new MyCallable(100));
        Future<String> f4 = pool.submit(new MyCallable(100));

        try {
            System.out.println(f1.get());
            System.out.println(f1.get());
            System.out.println(f1.get());
            System.out.println(f1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
