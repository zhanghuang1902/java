package com.java8;

/**
 * ClassName:User
 * Package:com.java8
 * Description:
 *
 * @date:2021/1/11 14:12
 * @author:zh
 */
public class User {

    private String name;

    private String age;

    private String classId;

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

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }


    public User(String name, String age, String classId) {
        this.name = name;
        this.age = age;
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", classId='" + classId + '\'' +
                '}';
    }
}
