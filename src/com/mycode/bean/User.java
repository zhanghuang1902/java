package com.mycode.bean;

import java.util.Objects;

/**
 * ClassName:User
 * Package:com.mycode.bean
 * Description:
 *
 * @date:2020/12/29 11:46
 * @author:zh
 */
public class User {

    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getName().equals(user.getName()) &&
                getAge().equals(user.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
