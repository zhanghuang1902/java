package com.javase.day03;

/**
 * ClassName:ArrayUtil
 * Package:com.javase.day03
 * Description:
 *
 * @date:2020/7/21 10:02
 * @author:zh
 */

/**
 * 自定义数组工具类
 * @author Admin
 */
public class ArrayUtil {
    //求数组的最大值
    public int getMax(int [] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    //求数组的最小值
    public int getMin(int [] arr){
        int min=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    //求数组的总和
    public int getSum(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return  sum;
    }

    //求数组的平均数
    public int getAvg(int [] arr){
        return getSum(arr)/arr.length;
    }

    //反转数组
    public void reverse(int [] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }

    //复制数组
    public int[] copy(int [] arr){
        int[] arr1=new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=arr[i];
        }
        return arr1;
    }


}
