package com.javase.day04;

/**
 * ClassName:Boy
 * Package:com.javase.day04
 * Description:
 *
 * @date:2020/7/22 15:30
 * @author:zh
 */
public class Boy {

    private String name;

    private int age;

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

    public void marry(Girl girl){
        System.out.println("我想娶"+girl.getName());
    }

    public void shout(){
        if(this.age>=22){
            System.out.println("你可以去结婚了");
        }else{
            System.out.println("先谈恋爱");
        }
    }
}
