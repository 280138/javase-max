package com.itheima.demo3threadsafe;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;

    public void drawmoney(double money) {
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
