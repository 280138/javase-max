package com.itheima.demo3threadsafe;

public class ThreadDemo1 {
    public static void main(String[] args) {
        //目标：模拟线程安全问题

        //依赖注入
        Account acc = new Account("ICBC-1111", 10000);

        new DrewThread("小明",acc).start();
        new DrewThread("小红",acc).start();
    }
}
