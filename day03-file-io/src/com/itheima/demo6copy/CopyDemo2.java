package com.itheima.demo6copy;

import java.io.*;

public class CopyDemo2 {
    public static void main(String[] args) {
        //目标：关闭资源的新方式：try-with-resources
        //源文件：D:\JianLI\bb.jpg
        //目标文件：D:\JianLI\bb_copy.jpg （复制过去的时候必须带文件名的，无法自动生成文件名）
        copyFile("D:\\JianLI\\bb.jpg","D:\\JianLI\\bb_copy.jpg");
    }

    //复制文件
    public static void copyFile(String srcPath,String destPath)  {
        //1、创建字节管道
        try (
                //这里只能放置资源对象否则报错，用完后，会自动调用close方法关闭资源
                //资源：最终实现了AutoCloseable接口的资源对象
                InputStream is = new FileInputStream(srcPath);
                OutputStream os = new FileOutputStream(destPath);
                MyConn myConn = new MyConn();  //自定义的资源对象，最终会自动调用close方法关闭资源
                ){
            //2、字节数组的读取与写入
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer,0,len);//读取多少个字节，写出多少个字节
            }
            System.out.println("复制成功");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyConn implements Closeable{
    @Override
    public void close() throws IOException {
        System.out.println("关闭连接");
    }
}
