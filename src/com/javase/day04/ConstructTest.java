package com.javase.day04;

/**
 * ClassName:constructTest
 * Package:com.javase.day04
 * Description:
 *
 * @date:2020/7/22 11:50
 * @author:zh
 */

/**
 *
 * @author Admin
 * 1.构造器的作用：
 *      1.创建对象
 *      2.初始化对象属性
 * 2.说明：
 *      1.如果系统没有显示的定义类的构造器的话，则系统默认提供一个空参的构造器
 *      2.定义构造器的格式：权限修饰符 类名（形参列表）{}
 *      3.一个类中定义的多个构造器，彼此构成重载
 *      4.一旦我们显示的定义了类的构造器之后，系统就不再提供默认的空参构造器
 *      5.一个类中一定存在构造器（至少存在一个）
 *      6.构造器属于典型的方法重载
 *
 */
public class ConstructTest {

    public static void main(String[] args) {
        //创建类的对象：new +构造器
        Person person = new Person();
        person.setAge(10);
        System.out.println(person.getAge());
        //构造器初始化对象属性
        Person person1 = new Person("张煌", 14);
        System.out.println(person1.getName());
    }
}

class Person{
    String name;

    int  age;

    //构造器
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public Person() {
    }

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
}
