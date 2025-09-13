package com.itheima.demo8filewriter;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterDemo1 {
    public static void main(String[] args) {
        //目标：了解文件字符输出流
        try (
            //1、创建文件输出流对象
//            Writer fw = new FileWriter("file-io\\src\\zyc07.txt");//覆盖管道
            Writer fw = new FileWriter("file-io\\src\\zyc07.txt",true);//追加数据
            ){
            //2、写一个字符出去
            fw.write('a');//public void write(int c) 字符底层按编码存
            fw.write(98);//public void write(int c)
            fw.write('宸');
            fw.write("\r\n");
            //3、写一个字符串出去
            fw.write("我会成为最好的程序员");
            fw.write("\r\n");
            //4、写一个字符串的一部分出去
            fw.write("java",1,2);
            fw.write("\r\n");
            //5、写一个字符数组出去 public void write(char[] cbuf);
            char[] chars = "java".toCharArray();
            fw.write(chars);
            fw.write("\r\n");
            //6、写一个字符数组的一部分出去 public void write(char[] cbuf,int off,int len);
            fw.write(chars,1,2);
            fw.write("\r\n");

            fw.flush();//刷新缓冲区，将缓冲区的数据全部写出去
            //刷新后，流可以继续使用
            //fw.close();//关闭资源，包含了刷新！关闭后流不能继续使用
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
