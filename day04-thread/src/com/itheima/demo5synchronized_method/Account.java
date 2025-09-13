package com.itheima.demo5synchronized_method;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;

    //同步方法格式
    //修饰符 synchronized 返回值类型 方法名（参数）{}
    public synchronized void drawmoney(double money) {
        String name = Thread.currentThread().getName();
        if (this.money >= money) {
            System.out.println(name + "取钱成功，取钱金额：" + money );
            this.money -= money;
            System.out.println(name + "取钱成功，余额为：" + this.money);
        }else {
            System.out.println(name + "取钱失败，余额不足！");
        }
    }
}
