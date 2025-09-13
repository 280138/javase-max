package com.itheima.demo7tcp4;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderRunnable implements Runnable{

    private Socket socket;

    public ServerReaderRunnable(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
           //给当前对应的浏览器管道响应一个网页数据回去
            OutputStream os = socket.getOutputStream();
            //通过字节输出流包装数据写出去给浏览器
            //把字节输出流包装成打印流
            PrintStream ps = new PrintStream(os);
            //写响应的网页数据出去
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=UTF-8");
            ps.println();//必须换行
            ps.println("<html>");
            ps.println("<head>");
            ps.println("<meta charset='UTF-8'>");
            ps.println("<title>");
            ps.println("加油");
            ps.println("</title>");
            ps.println("</head>");
            ps.println("<body>");
            ps.println("<h1 style='color:red;font-size:20px'>加油你是最棒的</h1>");
            ps.println("</body>");
            ps.println("</html>");
            ps.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("客户端下线了：" + socket.getInetAddress().getHostAddress());
        }
    }
}
