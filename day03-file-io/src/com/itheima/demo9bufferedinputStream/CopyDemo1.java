package com.itheima.demo9bufferedinputStream;

import java.io.*;

public class CopyDemo1 {
    public static void main(String[] args) {
        //目标：缓冲字节流的使用
        //源文件：D:\JianLI\bb.jpg
        //目标文件：D:\JianLI\bb_copy.jpg （复制过去的时候必须带文件名的，无法自动生成文件名）
        copyFile("D:\\JianLI\\bb.jpg","D:\\JianLI\\bb_copy.jpg");
    }

    //复制文件
    public static void copyFile(String srcPath,String destPath)  {//方法的传参
        try (
                //这里只能放置资源对象否则报错，用完后，会自动调用close方法关闭资源
                //资源：最终实现了AutoCloseable接口的资源对象
                InputStream fis = new FileInputStream(srcPath);
                //1、把低级的字节输入流包装成高级的缓冲字节输入流
                InputStream bis = new BufferedInputStream(fis);

                OutputStream fos = new FileOutputStream(destPath);
                //2、把低级的字节输出流包装成高级的缓冲字节输出流
                OutputStream bos = new BufferedOutputStream(fos);
                ){
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
            System.out.println("复制成功");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

