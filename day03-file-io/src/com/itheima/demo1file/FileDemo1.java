package com.itheima.demo1file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        //目标：了解File

        //1、创建File对象  public File(String pathname)
//        File f1 = new File("D:\\a.txt");  //两个反斜杠：第一个反斜杠表示第二杠就是一个反斜杠
        File f1 = new File("D:\\bbbsss\\666.jpg");
        System.out.println(f1.length());//字节名称
        System.out.println(f1.getName());//文件名称
        System.out.println(f1.isFile());//判断是否是文件 true
        System.out.println(f1.isDirectory());//判断是否是文件夹 false

        //2、使用相对路径定义文件对象
        //绝对路径： （带盘符） D:\bbbsss\666.jpg
        //相对路径： 不带盘符，默认是到项目的根目录下直接寻找文件
        File f2 = new File("file-io\\src\\com\\itheima\\demo1file\\zyc01.txt");//相对路径
        System.out.println(f2.length());

        //3、创建File对象代表不存在的文件
        File f3 = new File("D:\\bbbsss\\999.txt");
        System.out.println(f3.exists());
        System.out.println(f3.createNewFile());//把这个文件创建出来

        //4、创建File对象代表不存在的文件夹
        File f4 = new File("D:\\bbbsss\\aaa");
        System.out.println(f4.mkdir());//mkdir 只能创建一级文件夹//如果  D:\bbbsss\父目录存在 且  aaa目录 不存在，则创建成功并返回 true；否则返回 false。
        //************创建多级文件夹************
        File f5 = new File("D:\\bbbsss\\kkk\\bbb\\ccc");
        System.out.println(f5.mkdirs());

        //5、删除File对象代表存在的目录
        File f6 = new File("D:\\bbbsss\\888.jpg");
        System.out.println(f6.delete());//删除文件,只能删除空文件，不能删除非空文件
        File f7 = new File("D:\\bbbsss\\kkk");
        System.out.println(f7.delete()); //非空，无法删除

        //************6.可以获取某个目录下的全部一级文件名称************list()和listFiles()
        File f8 = new File("D:\\bbbsss\\软件需求");
        String[] list = f8.list();
        for (String s : list) {
            System.out.println(s);
        }

        //************7.可以获取某个目录下的全部一级文件对象************listFiles()方法
        File f9 = new File("D:\\bbbsss\\软件需求");
        //listFiles()返回的是文件型数组
        File[] files = f9.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsoluteFile()); //绝对路径
//          System.out.println(file.delete());  !!!全部删除
        }
    }
}
