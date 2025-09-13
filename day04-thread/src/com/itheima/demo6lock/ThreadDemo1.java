package com.itheima.demo6lock;

public class ThreadDemo1 {
    public static void main(String[] args) {
        //目标：线程同步方式三： lock接口的实现类ReentrantLock实现

        //依赖注入
        Account acc = new Account("ICBC-1111", 10000);

        new DrewThread("小明",acc).start();
        new DrewThread("小红",acc).start();
    }
}
