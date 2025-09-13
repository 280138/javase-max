package com.itheima.demo11bufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterDemo1 {
    public static void main(String[] args) {
        //目标：了解 缓冲字符输出流  提升性能，换行功能
        try (
                //1、创建文件输出流对象
//            Writer fw = new FileWriter("file-io\\src\\zyc07.txt");//覆盖管道
                Writer fw = new FileWriter("file-io\\src\\zyc07.txt",true);//追加数据

                //2、创建 缓冲字符输出流 包装 文件输出流
                BufferedWriter bw = new BufferedWriter(fw);//不用多态，独有功能
            ){
                    //2、写一个字符出去
                    bw.write('a');//public void write(int c) 字符底层按编码存
                    bw.write(98);//public void write(int c)
                    bw.write('宸');
                    bw.newLine();
                    //3、写一个字符串出去
                    bw.write("我会成为最好的程序员");
                    bw.newLine();
                    //4、写一个字符串的一部分出去
                    bw.write("java",1,2);
                    bw.newLine();
                    //5、写一个字符数组出去 public void write(char[] cbuf);
                    char[] chars = "java".toCharArray();
                    bw.write(chars);
                    bw.newLine();
                    //6、写一个字符数组的一部分出去 public void write(char[] cbuf,int off,int len);
                    bw.write(chars,1,2);
                    bw.newLine();

                    bw.flush();//刷新缓冲区，将缓冲区的数据全部写出去
                    //刷新后，流可以继续使用
                    //fw.close();//关闭资源，包含了刷新！关闭后流不能继续使用
            }catch (Exception e){
                e.printStackTrace();
            }
    }
}
