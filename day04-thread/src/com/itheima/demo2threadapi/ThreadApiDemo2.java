package com.itheima.demo2threadapi;

public class ThreadApiDemo2 {
    public static void main(String[] args) {
        //目标：Thread类的Sleep方法（线程休眠）
        for (int i = 0; i < 100; i++) {
            System.out.println("线程1：" + i);
            try {
                Thread.sleep(1000);//线程休眠1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
