package com.javase.day04;

/**
 * ClassName:UserTest
 * Package:com.javase.day04
 * Description:
 *
 * @date:2020/7/22 13:36
 * @author:zh
 */

/**
 *
 * @author Admin
 * 总结：属性赋值的先后顺序
 *
 * 1.默认初始化
 * 2.显式初始化
 * 3.构造器赋值
 * 4.通过对象.方法 或对象.属性 的方式赋值
 *
 * 操作的先后顺序：1-2-3-4
 *
 * 如果后续有顺序赋值属性操作，属性值最终按最后顺序结果赋值
 */
public class UserTest {
    public static void main(String[] args) {
        User u=new User();
        System.out.println(u.age);
        //构造器中赋值
        User user = new User(2);
        //对象.方法赋值
        user.setAge(3);
        System.out.println(user.age);
    }
}
class User{
    //默认初始化值
    String  name;
    //显式初始化
    int age=1;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(int age) {
        this();
        this.age = age;
    }

    public User() {
        System.out.println("张煌");
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