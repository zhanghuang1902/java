package com.javase.day06_extends;

/**
 * ClassName:Person
 * Package:com.javase.day06_extends
 * Description:
 *
 * @date:2020/7/23 16:13
 * @author:zh
 */
public class Person {

    private String name;

    private String age;

    public Person(String name, String age) {
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}
