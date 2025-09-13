package com.itheima.demo2recursion;

import java.io.File;
import java.io.IOException;

public class RecursionDemo3 {
    public static void main(String[] args) {
        //目标：完成文件搜索，找出D：盘下的QQ.exe的位置
        try {
            File dir = new File("C:\\Program Files (x86)\\Tencent\\QQNT");//C:\Program Files (x86)\Tencent\QQNT\QQ.exe
            searchFile(dir,"QQ.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 搜索文件
     * @param dir
     * @param fileName
     */
    public static void searchFile(File dir,String fileName) throws IOException {
        //1、判断极端情况
        if (dir == null || !dir.exists() || dir.isFile()){
            return; //退出
        }

        //2、获取文件下所有一级文件或者文件夹对象
        File[] files = dir.listFiles();

        //3、判断当前目录下是否存在一级文件对象，存在才可以遍历
        if (files != null && files.length > 0){
            //4、遍历一级文件对象
            for (File file : files) {
                if (file.isFile()){
                    //5、判断文件名是否一致
                    if (file.getName().contains(fileName)){
                        System.out.println("找到文件：" + file.getAbsolutePath());
                        Runtime runtime = Runtime.getRuntime();
                        runtime.exec(file.getAbsolutePath());
                        return; //退出
                    }
                }else {
                    //6、判断当前文件是否是文件夹
                    //7、如果是文件夹，则继续递归
                    searchFile(file,fileName);
                }
            }
        }
    }
}
