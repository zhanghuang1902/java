package com.javase.day04;

/**
 * ClassName:Girl
 * Package:com.javase.day04
 * Description:
 *
 * @date:2020/7/22 15:34
 * @author:zh
 */
public class Girl {

    private String name;

    private int  age;

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

    public void marry(Boy boy){
        System.out.println("我想嫁给"+boy.getName());
        boy.marry(this);
    }

    /**
     * 比较对象大小  一般比较的时对象的属性大小 地址值无法比较
     * @param girl
     * @return
     */
    public int compare(Girl girl){
        return this.age-girl.age;
    }
}
