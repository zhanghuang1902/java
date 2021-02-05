package com.mycode;

import com.mycode.bean.User;

/**
 * ClassName:MyCode
 * Package:com.mycode
 * Description:
 *
 * @date:2020/12/29 11:11
 * @author:zh
 */
public class MyCode {

    public static void main(String[] args) {
        //分别间隔一个空格,两个空格,一个tab制表符
        String str = "a b  c    d";

        //四种分隔符
        String[] arr1 = str.split(" ");
        String[] arr2 = str.split("s");
        String[] arr3 = str.split("\t");
        String[] arr4 = str.split("\\s+");

//打印
        for (String s : arr1) {
            System.out.print(s+",");
        }
        System.out.println("");
        for (String s : arr2) {
            System.out.print(s+",");
        }
        System.out.println("");
        for (String s : arr3) {
            System.out.print(s+",");
        }
        System.out.println("");
        for (String s : arr4) {
            System.out.print(s+",");
        }

    }
}
