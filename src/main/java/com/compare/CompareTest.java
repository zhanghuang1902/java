package com.compare;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName:ComepareTest
 * Package:com.compare
 * Description:
 *
 * @date:2020/9/15 11:25
 * @author:zh
 * 说明：java对象中，正常情况下，只能进行比较： == 或！=  不能使用《 》
 * 但是再开发场景中，我们需要对多个对象进行排序，言外之意，需要比较对象的大小
 *
 * 实现：
 *  使用两个接口种的任何一个 Comparable 或 Comparator
 *
 *  1.Comparable接口的使用(自然排序）
 *          1.String  实现了comparable接口 重写了compareTo()方法，给出了比较两个对象大小规则
 *          2.重写compareTo(obj)的规则
 *
 *  2.Comparator接口的使用：定制排序
 *  1。背景：
 *      当元素的类型没有实现java.lang.Comparable接口而又不方便修改代码
 *      或者实现了java.lang.Comparable接口的排序规则不适合当前的操作，
 *      那么可以考虑使用Comparator的对象来排序
 *  2.重写compare(Object o1,Object o2)方法，比较o1和o2的大小：
 *      如果方法返回正整数，则表述o1大于o2
 *      如果方法返回0，则表述o1等于o2
 *      如果方法返回负整数，则表述o1小于o2
 */
public class CompareTest {

    @Test
    public void test1(){
        //1.String  实现了comparable接口 重写了compareTo()方法，给出了比较两个对象大小规则
        //2.重写compareTo(obj)的规则
        //如果当前对象this大于形参对象obj，则返回正整数
        //如果当前对象this小于形参对象obj,则返回负整数
        //如果当前对象this等于形参对象obj,则返回零
        //3.对于自定义类，如果需要排序，我们需实现comparable接口，从写compareTo(OBJ)
        String[] arr=new String[]{"aa","cc","vv","bb"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2(){
        Goods[] goods=new Goods[4];
        goods[0]=new Goods("小米", 22.5);
        goods[1]=new Goods("联想", 12.5);
        goods[2]=new Goods("大米", 52.5);
        goods[3]=new Goods("红米", 22.5);
        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));
    }

    @Test
    public void test3(){}{
        String[] arr=new String[]{"aa","cc","vv","bb"};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof  String){
                    String s1=(String)o1;
                    String s2=(String)o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("类型异常");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
