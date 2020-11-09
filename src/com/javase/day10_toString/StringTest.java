package com.javase.day10_toString;

import org.junit.Test;

/**
 * ClassName:StringTest
 * Package:com.javase.day10_toString
 * Description:
 *
 * @date:2020/9/22 9:05
 * @author:zh
 */
public class StringTest {

    @Test
    public void test(){
        String s="http://192.168.0.52/520/99/11";
        String substring = s.substring(19);
        System.out.println(substring);
        String[] split = substring.split("/");
        for (String s1 : split) {
            System.out.println(s1);
        }
    }
}
