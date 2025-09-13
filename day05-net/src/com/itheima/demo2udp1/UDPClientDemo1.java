package com.itheima.demo2udp1;

import java.net.*;

public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：完成UDP通信一发一收：客户端开发

        System.out.println("=========客户端启动=========");
        //1、创建发送端对象
        DatagramSocket socket = new DatagramSocket();//随机端口

        //2、创建数据包对象封装要发送的数据
        byte[] bytes = "宝宝嘛嘛嘛".getBytes();
        /**
         * public DatagramPacket(byte buf[], int length
         *             InetAddress address,int port);
         * 参数一：发送的数据，字节数组
         * 参数二：发送的字节长度
         * 参数三：*目的地的IP地址*
         * 参数四：服务端程序的端口号
         */
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length,
                InetAddress.getLocalHost(),8080);
        //3、让发送端对象发送数据包的数据
        socket.send(packet);
        //4、关闭资源
        socket.close();
    }
}
