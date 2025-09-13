package com.itheima.demo3threadsafe;

public class DrewThread extends Thread{
    private Account acc;
    public DrewThread(String name,Account acc){
        super(name);
        this.acc = acc;//用构造器传递对象
    }
    @Override
    public void run() {
        //取钱

        //依赖注入
        //实例方法调用 格式： 对象.方法名（）
        //静态方法调用 格式： 类名.方法名（）
        acc.drawmoney(10000);//此处acc是通过构造器传递的，在别处创建的对象
    }
}
