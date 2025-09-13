package com.itheima.demo2recursion;

public class RecursionDemo1 {
    public static void main(String[] args) {
        //目标： 认识递归的形式
        printA();
    }

    private static void printA() {
        System.out.println("============A执行了============");
        printA();
    }
}
