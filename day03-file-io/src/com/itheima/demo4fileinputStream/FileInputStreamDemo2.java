package com.itheima.demo4fileinputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        //目标：掌握文件字节输入流读取文件中的字节数组到内存中来
        //1、创建 字节输入流管道 与源文件连通
        InputStream is = new FileInputStream("file-io\\src\\zyc04.txt");
        byte[] bs = new byte[1024];


        //2、一次性读完文件的所有字节
        //byte[] bs = is.readAllBytes(); JDK9

        is.close();
    }
}
