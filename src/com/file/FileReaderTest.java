package com.file;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * ClassName:FileReder
 * Package:com.file
 * Description:
 *
 * @date:2020/10/28 10:10
 * @author:zh
 */
public class FileReaderTest {

    public static void main(String[] args) throws IOException {
//        FileReader reader = null;
        try {
//            File file = new File("C:\\Users\\Admin\\Desktop\\hello.txt");
//            reader = new FileReader(file);
//            int read = reader.read();
//            while (read!=-1){
//                System.out.print((char)read);
//                read=reader.read();
//            }
            List<String> strings = Files.readAllLines(Paths.get("C:\\Users\\Admin\\Desktop\\hello.txt"));
            System.out.println(strings);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            reader.close();
        }
    }

    @Test
    public void test1() throws IOException {
        FileReader reader = null;
        try {
            File file = new File("C:\\Users\\Admin\\Desktop\\hello.txt");
            reader = new FileReader(file);
            int read = reader.read();
            while (read!=-1){
                System.out.print((char)read);
                read=reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }


    @Test
    public void test2() throws IOException {
        FileReader reader = null;
        try {
            File file = new File("C:\\Users\\Admin\\Desktop\\hello.txt");
            reader = new FileReader(file);
            char[] chars=new char[1024];
            int len=0;
            while ((len=reader.read(chars))!=-1){
                System.out.println(new String(chars, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }

    @Test
    public void test3() throws IOException {
        for (int i = 0; i < 100; i++) {
            Files.copy(Paths.get("C:\\Users\\Admin\\Desktop\\1\\阿里新版619java开发手册1.pdf"),Paths.get("C:\\Users\\Admin\\Desktop\\fenlei","阿里新版619java开发手册"+i+".pdf"));
        }

    }


}
