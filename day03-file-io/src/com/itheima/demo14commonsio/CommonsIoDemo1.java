package com.itheima.demo14commonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIoDemo1 {
    public static void main(String[] args) throws IOException {
        //目标：使用commons-io
        FileUtils.copyFile(new File("file-io\\src\\csb_out.txt"),new File("file-io\\src\\csb_out2.txt"));
    }
}
