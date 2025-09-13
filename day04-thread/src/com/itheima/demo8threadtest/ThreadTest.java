package com.itheima.demo8threadtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadTest {
    public static void main(String[] args) {
        List<Integer> redPackets = getRedPacket();//锁对象 单一实例
        //2、定义线程类，创建100个线程，竞争同一个集合
        for (int i = 1; i <= 100; i++) {
            new PeopleGetRedPacket(redPackets,"人"+i).start();
        }
    }


    //1、准备200个红包
    public static List<Integer> getRedPacket(){
        Random r = new Random();
        List<Integer> redPackets = new ArrayList<>();
        for (int i = 0; i < 160; i++) {
            redPackets.add(r.nextInt(30) + 1);
        }
        for (int i = 0; i < 40; i++) {
            redPackets.add(r.nextInt(70) + 31);
        }

        return redPackets;
    }
}
