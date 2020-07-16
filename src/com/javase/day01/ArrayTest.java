package com.javase.day01;

/**
 * 数组
 * 数组名、下表、元素、数组的长度
 * 数组是有序排列的
 * 数组属于引用数据类型
 * 数组的元素既可以是基本数据类型  又可以是引用数据类型
 * 数组的长度一旦确定，不可以修改
 * 数组的分类：
 *      一维数组 二位数组 三维数组。。。
 *      基本类型数组  引用类型数组
 */
public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("sb");
        int [] ids;//声明
        //静态初始化:数组的初始化和数组元素的赋值操作同时进行
        ids=new int[]{1001,1002,1003,1004};
        System.out.println(ids.toString());
        //动态初始化：数组的初始化和数组元素的赋值分开进行
        String [] names=new String[5];
        System.out.println(names);
        //数组一旦初始化完成，长度就确定了
        names[0]="1";
        names[1]="2";
        names[2]="3";
        names[3]="4";
        names[4]="5";
        //获取数组的长度
        System.out.println(names.length);
        //遍历数组元素
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
