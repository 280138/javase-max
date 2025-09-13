package com.itheima.demo8api;

public class Test2StringBuilder {
    public static void main(String[] args) {
        //操作字符串：StringBuilder 定义字符串：String
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("fjt");
        }
        System.out.println(sb);
        //StringBuilder只是拼接字符串的手段，结果还是要恢复字符串类型(目的)
        String s = sb.toString();
//        System.out.println(s);

        StringBuilder sb2 = new StringBuilder();
        String s2 = sb2.append("zyc").append("fjt").toString();
    }
}
