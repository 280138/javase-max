package com.itheima.demo4synchronized_code;

public class ThreadDemo1 {
    public static void main(String[] args) {
        //目标：线程同步的方式一： 同步代码块

        //依赖注入
        Account acc = new Account("ICBC-1111", 10000);

        new DrewThread("小明",acc).start();
        new DrewThread("小红",acc).start();
    }
}
