package com.javase.day03;

/**
 * ClassName:ArrayUtilTest
 * Package:com.javase.day03
 * Description:
 *
 * @date:2020/7/21 10:07
 * @author:zh
 */
public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int [] arr=new int[]{32,34,32,5,3,45,654,-98,0,-53,5};
        int max = util.getMax(arr);
        System.out.println("最大值："+max);
        int min = util.getMin(arr);
        System.out.println("最小值："+min);
        int sum = util.getSum(arr);
        System.out.println("总和："+sum);
        int avg=util.getAvg(arr);
        System.out.println("平均值："+avg);
        util.reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+",");
        }
    }
}
