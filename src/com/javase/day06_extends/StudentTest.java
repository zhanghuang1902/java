package com.javase.day06_extends;

/**
 * ClassName:StudentTest
 * Package:com.javase.day06_extends
 * Description:
 *
 * @date:2020/7/23 16:39
 * @author:zh
 * 继承性 why:
 * 1.减少代码的冗余,提高代码的复用性
 * 2.便于功能的扩展
 * 3.多态性的使用提供了前提
 *
 * 2.继承性的格式 class A extends B
 *      A:子类/派生类/subclass
 *      B:父类/超类/基类/superclass
 *      体现:一旦子类A继承父类B 子类A就获取了父类的结构/属性/方法
 *          父类中声明private的属性或方法,子类集成父类以后,仍然认为获取父类
 *          中私有的结构,只是因为封装性的影响,使得子类不能直接调用父类的结构而已
 *      子类继承父类以后,还可以声明自己特有的属性或方法,实现功能的拓展.
 *
 *
 * 3.Java中关于继承性的规定:
 *      1.一个类可以被多个子类继承
 *      2.一个类只用一个父类.单继承
 *      3.子父类是相对的概念
 *      4.子类继承父类以后,就获取直接父类或间接父类的属性和方法
 *
 * 4.1.如果我们没有显示声明一个类的父类的话,则此类继承于java.lang.Object类
 *    2.所有的java类 都直接或间接集成于  java.lang.Object类
 *    3.意味着所有的java 类具有java.lang.Object的属性和声明的功能
 */
public class StudentTest {

    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
        Student student = new Student();
        student.eat();
        student.sleep();
        student.study();
    }
}
