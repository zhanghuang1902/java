package com.javase.day04;

/**
 * ClassName:AnimlTest
 * Package:com.javase.day04
 * Description:
 *
 * @date:2020/7/21 20:26
 * @author:zh
 */

/**
 * 1.封装性设计思想：把该隐藏的隐藏起来，该暴漏的暴漏出来，这是封装性的设计思想
 * 2.封装性的提现：
 *  1.类的属性xxx私有化，同时提供公共的public方法来获取get 和 set 方法
 *  2.不对外暴漏的私有方法
 *  3.单例模式
 * 。。。
 * 3.封装性的提现，需要权限修饰符来配合
 *  1.java 规定的4中权限：private /缺省 /protected /public
 *  private 类使用
 *  缺省 同一个包下使用
 *  protected 不同包的子类使用
 *  public 同一工程使用
 *
 *  2.4种权限可以用来修饰类及类的内部结构：属性/方法/构造器/内部类
 *
 *  3.具体的，4种权限都可以用来修饰类的内部结构：属性/方法/构造器/内部器
 *              修饰类的话：只能使用：缺省/public
 *
 * @author Admin
 */
public class AnimalTest {

    private String name;

    private int age;

    private int legs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
