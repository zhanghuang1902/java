package com.javase.day10_static;

/**
 *
 *
 * 1.static关键字的使用
 *
 * 修饰属性：静态变量
 *  属性：按是否使用static修饰，分为：静态属性  非静态属性（实例变量）
 *  实例变量：我们创建类的多个对象，每个对象都独立的拥有一套类中的非静态属性，当修改其中一个对象中的非静态属性时
 *  ，不会导致其他对象中同样的属性值的修改
 *
 *  静态变量：1.我们创建类的多个对象，多个对象共享一个静态变量，当通过某一个对象修改静态变量时，会导致其他对象调用此
 *  静态变量时，也随之修改
 *
 *           2.静态变量随着类的加载而加载，可以通过“类.静态变量” 的方式进行调用
 *           3.静态变量的加载 要早于对象的创建
 *           4.由于类只会加载一次，则静态变量在内存中也会存在一份，存在方法去的静态域中
 *
 */
public class StaticTest {

    public static void main(String[] args) {
        Chinese chinese = new Chinese();
        chinese.age=10;
        chinese.china="中国";
        Chinese chinese1 = new Chinese();
        chinese1.age=20;
        System.out.println(chinese1.age);
        System.out.println(chinese1.china);

    }
}


class Chinese{

    int age;

    String name;

    static  String china;

}