package com.itheima.demo3udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerDemo2 {
    public static void main(String[] args) throws Exception {
        //目标：完成UDP通信多发多收：服务端开发

        System.out.println("==========服务端启动=========");
        //1、创建接收端对象
        DatagramSocket socket = new DatagramSocket(8080);

        //2、创建数据包对象，封装要接收的数据
        byte[] buf = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        while (true) {
            //3、让接收端对象接收对象的数据
            socket.receive(packet);

            //4、看看数据是否收到
            int len = packet.getLength();
            String data = new String(buf,0,len);//
            System.out.println("服务端收到了:" + data);

            //5、获取对方的ip对象和程序端口
            String ip = packet.getAddress().getHostAddress();
            int port = packet.getPort();
            System.out.println("对方IP:" + ip + " 对方端口:" + port);

            System.out.println("--------------------------");
        }
    }
}
