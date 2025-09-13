package com.itheima.demo12inputstreamReader;

import java.io.*;

public class InputStreamReaderDemo1 {
    public static void main(String[] args) {
        //目标：缓冲字符输入流，提升性能，按行读功能
        //字符本质上是编号，可以用int接
        try (
                //提取文件的原始字节流
                InputStream is = new FileInputStream("file-io\\src\\zyc09.txt");
                //指定字符集把原始字节流转换成字符输入流
                Reader isr = new InputStreamReader(is,"GBK");
                //创建缓冲字符输入流包装成字符输入流
                BufferedReader br = new BufferedReader(isr);
        ) {
            //使用循环改进
            String line ;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
