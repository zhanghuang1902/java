package com.javase.day01;

/**
 * 二维数组
 * 1.二位数组的申明和初始化
 * 2.如何调用数组的指定位置的元素
 * 3.如何获取数组的长度
 * 4.如何遍历数组
 * 5.数组元素的默认初始值
 * 6.数组的内存解析
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        //二位数组静态初始化
        int [][] arrs=new int[][]{{1,2,3},{4,5},{6,7,8}};
        //二维数组动态初始化
        int [] [] arrs2=new int[3][2];
        //调取指定位置的元素
        System.out.println(arrs[1][1]);
        //获取数组的长度
        System.out.println(arrs2.length);
        for (int i = 0; i < arrs.length; i++) {
            for (int i1 = 0; i1 < arrs [i].length; i1++) {
                System.out.println(arrs[i][i1]);
            }
        }
    }

}
