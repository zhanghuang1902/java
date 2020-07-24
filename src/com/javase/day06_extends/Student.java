package com.javase.day06_extends;

/**
 * ClassName:Student
 * Package:com.javase.day06_extends
 * Description:
 *
 * @date:2020/7/23 16:13
 * @author:zh
 */
public class Student extends Person {

    private String cla;

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public void study(){
        System.out.println("学习");
    }


}
