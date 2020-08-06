package com.javase.day10_toString;

import com.javase.day09_equals.Order;
import org.junit.Test;

/**
 * ClassName:ToStringTest
 * Package:com.javase.day10_toString
 * Description:
 *
 * @date:2020/8/5 15:20
 * @author:zh
 * 1.当我们输出一个对象的引用时,实际就是调用当前object类的toString方法
 * 2.toString 方法:
 *     public String toString() {
 *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *     }
 * 3. String Date File 包装类等都重写了Object类的toString()方法
 *
 */
public class ToStringTest {


    @Test
    public void show(){
        int a=10;
        System.out.println(a+"");
        System.out.println("haha");
    }
    public static void main(String[] args) {
        Order order = new Order(10, "张煌");
        System.out.println(order.toString());//com.javase.day09_equals.Order@677327b6
        System.out.println(order);//com.javase.day09_equals.Order@677327b6
    }
}
