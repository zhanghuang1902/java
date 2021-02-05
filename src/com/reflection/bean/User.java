package com.reflection.bean;

/**
 * ClassName:User
 * Package:com.reflection.bean
 * Description:
 *
 * @date:2021/2/5 15:04
 * @author:zh
 */
public class User {

    private String age;

    private String name;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void play(){
        System.out.println("玩游戏");
    }
}
