package com.itheima.demo8threadtest;

import java.util.List;

public class PeopleGetRedPacket extends Thread{
    private List<Integer> redPackets;
    public PeopleGetRedPacket(List<Integer> redPackets, String name) {
        super(name);
        this.redPackets = redPackets;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (redPackets){
                if (redPackets.size() == 0) {
                    System.out.println(name + "没有抢到红包");
                    break;
                }
                int index = (int) (Math.random() * redPackets.size());
                Integer money = redPackets.remove(index);
                System.out.println(name + "抢到了" + money + "元");
                if (redPackets.size() == 0) {
                    System.out.println(name + "没有抢到红包");
                    break;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
