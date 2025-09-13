package com.itheima.demo4synchronized_code;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;

    //实例方法，没有加static
    public void drawmoney(double money) {
        String name = Thread.currentThread().getName();

        //实例方法建议使用  this  作为锁对象
        //静态方法建议使用 类名.class 作为锁对象
        synchronized (this) {
            if (this.money >= money) {
                System.out.println(name + "取钱成功，取钱金额：" + money );
                this.money -= money;
                System.out.println(name + "取钱成功，余额为：" + this.money);
            }else {
                System.out.println(name + "取钱失败，余额不足！");
            }
        }
    }
}
