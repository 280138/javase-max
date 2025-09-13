package com.itheima.demo1netadress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo1 {
    public static void main(String[] args) {
        //目标： 认识InetAdress类获取本机IP和对方IP对象
        try {
            //1.获取本机IP对象
            //获取本地主机的IP地址信息，返回一个inetAddress对象
            InetAddress ip1 = InetAddress.getLocalHost();

            System.out.println(ip1);
            System.out.println(ip1.getHostName());//3.获取主机名
            System.out.println(ip1.getHostAddress());//4.获取IP地址


            //2.获取对方IP对象
            //根据ip地址或者域名，返回一个inetAddress对象
            InetAddress ip2 = InetAddress.getByName("www.baidu.com");

            System.out.println(ip2);
            System.out.println(ip2.getHostName());
            System.out.println(ip2.getHostAddress());
            //5、判断本机与对方主机是否互通
            System.out.println(ip1.isReachable(5000));//ping
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
