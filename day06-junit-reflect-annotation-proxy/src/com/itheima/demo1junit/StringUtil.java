package com.itheima.demo1junit;

public class StringUtil {
    /**
     * 字符串工具类
     * @param name
     */
    public static void printNumber(String name){
        System.out.println("名字的长度是" + name.length());
    }

    /**
     * 求字符串的最大索引
     * @param data
     * @return
     */
    public static int getMaxIndex(String data){
        if (data == null){
            return -1;
        }
        return data.length();
    }
}
