package com.itheima.demo6copy;

import java.io.*;

public class CopyDemo1 {
    public static void main(String[] args) {
        //目标：使用字节流完成文件的复制操作
        //源文件：D:\JianLI\bb.jpg
        //目标文件：D:\JianLI\bb_copy.jpg （复制过去的时候必须带文件名的，无法自动生成文件名）
        copyFile("D:\\JianLI\\bb.jpg","D:\\JianLI\\bb_copy.jpg");
    }

    //复制文件
    public static void copyFile(String srcPath,String destPath)  {
        //1、创建字节管道
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(srcPath);
            os = new FileOutputStream(destPath);
            //2、字节数组的读取与写入
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer,0,len);//读取多少个字节，写出多少个字节
            }
            System.out.println("复制成功");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //finally最后一定会执行一次，即使程序出现异常
            //释放资源
            try {
                if(os !=null)os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if(os !=null)is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
