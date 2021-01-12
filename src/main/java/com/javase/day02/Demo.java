package com.javase.day02;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person();
        person.name="Tom";
        person.age=1;
        person.sex=1;
        person.study();
        person.showAge();
        int i = person.addAge(2);
        System.out.println(i);
        System.out.println(person.age);
    }
}

class Person{
    String name;
    int sex;
    int age;

    public void study(){
        System.out.println("Studying");
    }

    public void showAge(){
        System.out.println(age);
    }

    public int addAge( int i){
        return age+=i;
    }
}