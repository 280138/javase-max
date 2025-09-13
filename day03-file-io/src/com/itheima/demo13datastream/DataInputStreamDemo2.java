package com.itheima.demo13datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        //目标：特殊数据流的使用
        try (
                DataInputStream dis = new DataInputStream(new FileInputStream("file-io\\src\\9.9.txt"));
        ) {
            System.out.println(dis.readInt());
            System.out.println(dis.readByte());
            System.out.println(dis.readUTF());
            System.out.println(dis.readBoolean());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
