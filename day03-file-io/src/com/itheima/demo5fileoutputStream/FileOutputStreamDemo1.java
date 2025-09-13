package com.itheima.demo5fileoutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo1 {
    //1、new管道对象 2、调用实例方法read
    public static void main(String[] args) throws IOException {
        //目标：学会使用文件字节输出流

        //1、创建 文件字节输出流 管道对象
//        OutputStream os = new FileOutputStream("file-io\\src\\zyc05.txt");//覆盖管道，会把原来文件清空
        OutputStream os = new FileOutputStream("file-io\\src\\zyc05.txt",true);
        //2、写入数据
//        public void write(int b);
        os.write(97);//写入一个字节数据
        os.write('b');//写入一个字节数据
//        os.write('徐');//会乱码，因为不止一个字节数据
        os.write("\r\n".getBytes());

        //3、写一个字节数组出去
        //public void write(byte[] b);
//        byte[] bs = {97,98,99,100,101};
        byte[] bs = "我爱你中国666".getBytes();
        os.write(bs);
        os.write("\r\n".getBytes());

        //4、写一个字节数组的一部分出去
        //public void write(byte[] b,int off,int len);
        os.write(bs,0,3);
        os.write("\r\n".getBytes());

        os.close();//关闭管道
    }
}
