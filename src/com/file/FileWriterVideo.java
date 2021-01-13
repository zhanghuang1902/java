package com.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName:FileWriterVideo
 * Package:com.file
 * Description:
 *
 * @date:2021/1/12 17:55
 * @author:zh
 */
public class FileWriterVideo {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Admin\\Desktop\\1598841731655.mp4");
        String path="C:\\Users\\Admin\\Desktop\\文件包";
        FileReader reader = new FileReader(file);
        File file1 = new File(path);
        FileWriter writer = new FileWriter(path);
        char[] chars=new char[1024];
        int len=0;
        while ((len=reader.read(chars))!=-1){
            String s = new String(chars, 0, len);
            System.out.println(s);
            writer.write(s);
            writer.flush();
            writer.close();
        }

    }
}
