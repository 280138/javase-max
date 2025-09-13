package com.itheima.demo13datastream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataOutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：特殊数据流的使用
        try(
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("file-io\\src\\9.9.txt"));
                ){
            dos.writeInt(666);
            dos.writeByte(34);
            dos.writeUTF("hello world");
            dos.writeBoolean(true);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
