package com.itheima.demo7executorservice;

import java.util.concurrent.*;

public class ExecutorServiceDemo1 {
    public static void main(String[] args) {
        //目标： 使用线程池的实现类ThreadPoolExecutor声明 7 个参数来创建线程池对象
        ExecutorService pool = new ThreadPoolExecutor(3,5,
                10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        //2、使用线程池处理Runnable任务，会不会复用线程
        Runnable target = new MyRunnable();
        pool.execute(target);//提交第1个任务 创建第1个线程 自动启动线程处理这个任务
        pool.execute(target);//提交第1个任务 创建第1个线程 自动启动线程处理这个任务
        pool.execute(target);//提交第1个任务 创建第1个线程 自动启动线程处理这个任务
        pool.execute(target);//(复用线程)
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);//创建临时线程  核心线程忙，任务队列也满
        pool.execute(target);//创建临时线程
        pool.execute(target);//任务拒绝策略   核心线程和临时线程都忙，任务队列也满

        //3、关闭线程池，一般不关闭线程池
//        pool.shutdown();//等所有任务执行完毕，再关闭线程池
//        pool.shutdownNow();
    }
}
