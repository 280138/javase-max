package com.itheima.demo11bufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BufferedTest2 {
    public static void main(String[] args) {
        //目标：完成出师表案例
        try (
                //1、创建一个字符缓冲输入流对象与源文件连接
                BufferedReader br = new BufferedReader(new FileReader("file-io\\src\\csb.txt"));
                //6、创建一个字符缓冲输出流对象与目标文件连接
                BufferedWriter bw = new BufferedWriter(new FileWriter("file-io\\src\\csb_out.txt"))
        ) {
            //2、提前准备一个List集合存储每段内容
            List<String> data = new ArrayList<>();

            //3、按照行读取数据
            String line;
            while ((line = br.readLine()) != null){
                data.add(line);
            }

            //4、按首字符排序
            Collections.sort(data);
            System.out.println(data );

            //5、遍历集合，将每段内容写入目标文件
            for (String s : data) {
                bw.write(s);
                bw.newLine();
            }
            System.out.println("处理完毕！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
