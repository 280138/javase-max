package com.itheima.demo2recursion;

public class RecursionDemo2 {
    public static void main(String[] args) {
        System.out.println("5的阶乘为：" + f(5));//如果f()是实例方法，则必须创建对象才能调用
        System.out.println("1-5的和为：" + f2(5));
    }

    //递归 求阶乘
    public static int f(int n){ //如果不加static，这个就不是静态方法（类持有），而是实例方法（对象持有）
        if (n == 1){
            return 1;
        }else {
            return f(n-1) * n;
        }
    }

    //递归 求和
    public static int f2(int n){
        if (n == 1){
            return 1;
        }else {
            return f2(n-1) + n;
        }
    }
}
