package com.javase.day03;

/**
 * ClassName:Recursion
 * Package:com.javase.day03
 * Description:
 *
 * @date:2020/7/21 14:54
 * @author:zh
 */

/**
 * 递归：自己调自己
 * @author Admin
 * 递归一定要向已知方向递归，否则无穷递归，死循环
 */
public class Recursion {

    public static void main(String[] args) {
        //计算1-100之间所有自然数的和
        //方式1
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);
        int count=5;
        int method = method(count);
        System.out.println(method);
    }

    private static int  method(int count) {
        if(count==1){
            return 1;
        }else {
            System.out.println(count);
            return count+method(count-1);
        }
    }
}
