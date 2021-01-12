package com.javase.day07_super;

/**
 * super关键字的使用：
 * 1.super理解为：父类的
 * super可以用来调用属性、方法、构造器
 *
 * 2.super的调用属性和方法：
 *  1.我们可以在子类的方法或构造器，通过使用“super.属性”"或 super.方法“的方式，显示的调用父类中声明的属性或者方法，但是，通常情况下
 *  我们习惯省略“super"
 *  2.特殊情况，当子类和父类中定义了同名的属性时。我们要想在子类中调用父类中声明的属性，则必须显式的使用“super.属性”的方式，表明调用的
 *  是父类中声明的属性
 *
 * 3.super 调用构造器
 *      1.我们可以在子类的构造器中显式的使用“super(形参列表）"的方式，调用父类中声明的指定的构造器
 *      2.super(形参列表）的使用，必须声明在子类构造器的首行
 *      3.我们在类的构造器中针对this(形参列表）或super(形参列表）z只能出现一个
 *      4.在构造器首行，既没有this(形参列表）或super(形参列表) 默认调用super()
 */
public class Student extends Person {

    String major;

    String id;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student(String major) {
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生：多吃有营养的食物");
    }

    public void study(){
        System.out.println("学习");
    }

    public void show(){
        System.out.println("name ="+ this.name +",age ="+ super.age);
        System.out.println(id);
        System.out.println(super.id);//父类
    }
}
