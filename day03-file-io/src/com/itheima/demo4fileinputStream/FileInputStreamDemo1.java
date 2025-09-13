package com.itheima.demo4fileinputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo1 {

    //1、new管道对象 2、调用实例方法read
    public static void main(String[] args) throws Exception {
        //目标：掌握文件字节输入流读取文件中的字节数组到内存中来
        //1、创建 字节输入流管道 与源文件连通
        InputStream is = new FileInputStream("file-io\\src\\zyc03.txt");

        //2、开始读取文件中的字节并输出

        //定义一个变量记住每次读取的一个字节
        /**
         * read()方法是InputStream类中的方法
         * read()方法：读取一个字节01001011并返回，如果没有数据返回-1。
         * read(byte[] bs)方法：读取字节数组，装入字节数组，并返回读取的字节数，没有数据返回-1。
         * */

//        int b;
//        while ((b = is.read()) != -1) {
////            System.out.println(b);
//            System.out.print((char) b);
//        }
        //每次读取一个字节：性能较差 ，读取汉字会乱码

        //FileInputStream的实例方法
        //public int read(byte[] bs)
        byte[] buffer = new byte[3];
        int len;//读取的字节数
        while ((len = is.read(buffer)) != -1) {
//            System.out.println(new String(buffer));//abc666g66  g66?
            System.out.print(new String(buffer,0,len)); //字节==>字符串

        }

        //关闭管道
        is.close();

        //拓展：每次读取多个字节，性能得到提升，因为每次读取多个字节，可以减少硬盘和内存的交互次数，从而提升性能
        //依然无法避免读取汉字输出乱码的问题：存在阶段汉字字节的可能性
    }
}
