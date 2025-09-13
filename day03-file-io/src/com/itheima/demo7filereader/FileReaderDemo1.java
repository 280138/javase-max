package com.itheima.demo7filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        //目标：掌握文件字符输入流读取字符内容到程序中来
        //字符本质上是编号，可以用int接

        //1、创建 字符输入流 管道对象 与源文件连通
        try (
                Reader fr = new FileReader("file-io\\src\\zyc06.txt")
        ) {
            //2、定义一个字符数组，每次读多个字符
            char[] chs = new char[1024];
            int len;//读取的字符数
            while((len = fr.read(chs)) != -1){
                //3、把读到的字符数组转换成字符串输出
                System.out.print(new String(chs,0,len));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
