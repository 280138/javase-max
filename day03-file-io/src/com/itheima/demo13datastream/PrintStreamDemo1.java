package com.itheima.demo13datastream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    public static void main(String[] args) {
        //目标：打印流的使用
        try(
                PrintStream ps =new PrintStream(new FileOutputStream("D:\\JAVA\\code1\\javaseaiprojectmax\\file-io\\src\\ps.txt",true))
                ){
            ps.println(97);
            ps.println('a');
            ps.println(true);
            ps.println(3.14);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
