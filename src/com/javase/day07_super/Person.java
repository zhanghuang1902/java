package com.javase.day07_super;

public class Person {

    String name;

    int age;

    String id;

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

    public void eat(){
        System.out.println("吃饭");
    }
    public void walk(){
        System.out.println("跑步");
    }
}
