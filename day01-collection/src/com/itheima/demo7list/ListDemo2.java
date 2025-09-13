package com.itheima.demo7list;

import java.util.LinkedList;

public class ListDemo2 {
    public static void main(String[] args) {
        //目标：用LinkedList做一个队列对象
        LinkedList<String> queue = new LinkedList<>();
        //入队
        queue.addLast("小昭");
        queue.addLast("小華");
        queue.addLast("张无忌");
        queue.addLast("赵敏");
        queue.addLast("宋青书");
        System.out.println(queue);//[小昭, 小華, 张无忌, 赵敏, 宋青书]

        //出队
        System.out.println(queue.removeFirst());//小昭
        System.out.println(queue.removeFirst());//小華
        System.out.println(queue.removeFirst());//张无忌
        System.out.println(queue);
        System.out.println("------------------------------------------");

        //做一个栈
        LinkedList<String> stack = new LinkedList<>();
        //压栈
        stack.push("第1颗子弹");
        stack.addFirst("第2颗子弹");
        stack.addFirst("第3颗子弹");
        stack.addFirst("第4颗子弹");
        System.out.println(stack);

        //弹栈
        System.out.println(stack.pop());
        System.out.println(stack.removeFirst());
        System.out.println(stack);

    }
}
