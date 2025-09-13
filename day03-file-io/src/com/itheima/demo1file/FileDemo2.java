package com.itheima.demo1file;

import java.io.File;
import java.util.Arrays;

public class FileDemo2 {
    public static void main(String[] args) {
        //目标: 掌握File遍历一级文件，listFiles()方法
        /**
         * 当主调是文件，或者路径不存在时，返回null
         * 当主调是空文件夹时，返回一个长度为0的数组
         * 当主调是一个有内容的文件夹时，将里面所有一级文件和文件夹路径放在File数组中返回
         * 当主调是一个文件夹，且里面有隐藏文件时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
         * 当主调是一个文件夹，但是没有权限访问该文件夹时，返回Null
         */
        File f1 = new File("D:\\bbbsss\\软件需求\\j8ka\\666\\222");
        File[] files = f1.listFiles();
        System.out.println(Arrays.toString(files));// 不是遍历，Arrays.toString()将整个数组直接转换为字符串并打印出来
    }
}
