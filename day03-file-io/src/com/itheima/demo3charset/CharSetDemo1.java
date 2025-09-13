package com.itheima.demo3charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //目标：写程序实现编码和解码
        /**
         * 编码解码 ==> 字符 和 字节(码/00101001)  相互转换
         * 编码 通过String里面的实例方法（对象持有）getbyte()
         * 解码 通过String的构造器 String(byte[] bytes)
         */

        //1、编码
        String name = "我爱你中国Aa666"; //创建String的实例对象

//        byte[] bytes = name.getBytes();//平台的UTF-8编码，汉字占3个字节
        byte[] bytes = name.getBytes("GBK");//指定GBK进行编码
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        //2、解码
//        String names2 = new String(bytes);//平台的UTF-8解码，汉字占3个字节
        String names2 = new String(bytes,"GBK");//指定GBK解码
        System.out.println(names2);
    }
}
