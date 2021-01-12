package com.javase.day03;

import java.io.PrintStream;

/**
 * ClassName:Demo
 * Package:com.javase.day03
 * Description:
 *
 * @date:2020/7/21 14:25
 * @author:zh
 */
public class Demo {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        method(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);
        int[] arr1=new int[5];
        System.out.println(arr1);
        char [] arr=new char[]{'a','b'};
        System.out.println(arr);

    }

    private static void method(int a, int b) {
        PrintStream ps = new PrintStream(System.out){
            @Override
            public void println(String x) {
               if("a=10".equals(x)){
                   x="a=100";
               }else {
                   x="b=200";
               }
               super.println(x);
            }
        };
        System.setOut(ps);
    }
}
