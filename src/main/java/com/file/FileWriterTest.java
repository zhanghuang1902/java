package com.file;

import java.io.*;

/**
 * @author 97083
 */
public class FileWriterTest {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\97083\\Desktop\\WeChat_20210112200258.mp4");
        File file1 = new File("C:\\Users\\97083\\Desktop\\mytest\\1.mp4");
        FileInputStream reader = new FileInputStream(file);
        FileOutputStream writer = new FileOutputStream(file1);
        byte[] bytes = new byte[1024];
        int len=0;
        while ((len=reader.read(bytes))!=-1){
            writer.write(bytes,0,len);
            writer.flush();
        }
        reader.close();
        writer.close();
    }
}
