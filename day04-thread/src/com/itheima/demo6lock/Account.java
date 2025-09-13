package com.itheima.demo6lock;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;
    private final Lock lk = new ReentrantLock();//这里不能设置成静态，因为不能让所有账户都拿同一份锁

    public void drawmoney(double money) {
        String name = Thread.currentThread().getName();
        lk.lock();//上锁
        try {
            if (this.money >= money) {
                System.out.println(name + "取钱成功，取钱金额：" + money );
                this.money -= money;
                System.out.println(name + "取钱成功，余额为：" + this.money);
            }else {
                System.out.println(name + "取钱失败，余额不足！");
            }
        } finally {
            lk.unlock();//解锁,finally保证就算中间出异常也必须解锁
        }
    }
}
