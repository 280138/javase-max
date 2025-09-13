package com.itheima.demo6tcp3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws Exception {
        //目标：实现TCP通信下多发多收：服务器开发，支持多客户端开发
        System.out.println("服务器启动了...");
        //1、创建一个服务器ServerSocket，绑定端口号，监听客户端连接
        ServerSocket ss = new ServerSocket(9999);

    //改成用主线程负责接收客户端连接
        while (true) {
            Socket socket = ss.accept();//accept()放进循环接收多个客户端
            System.out.println("一个客户端上线：" + socket.getInetAddress().getHostAddress());
            //把客户端交给一个独立的子线程专门负责接收信息
           new ServerReader(socket).start();
        }
    }
}
