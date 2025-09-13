package com.itheima.demo10bufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderDemo1 {
    public static void main(String[] args) {
        //目标：缓冲字符输入流，提升性能，按行读功能
        //字符本质上是编号，可以用int接
        try (
                //1、创建 字符输入流管道 与源文件连通
                Reader fr = new FileReader("file-io\\src\\zyc08.txt");
                //2、创建 缓冲字符输入流 包装 低级的字符输入流
                BufferedReader br = new BufferedReader(fr);//不用多态，独有功能readLine()
        ) {
//            //2、定义一个字符数组，每次读多个字符
//            char[] chs = new char[1024];
//            int len;//读取的字符数
//            while((len = fr.read(chs)) != -1){
//                //3、把读到的字符数组转换成字符串输出
//                System.out.print(new String(chs,0,len));
//            }

//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());//null

            //使用循环改进
            String line ;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            //目前读文本最优雅的方案：性能好、不乱码、可以按照行读取
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
