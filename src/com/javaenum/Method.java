package com.javaenum;

/**
 * ClassName:Method
 * Package:com.javaenum
 * Description:
 *
 * @date:2020/9/15 17:20
 * @author:zh
 * 枚举类的父类 时  JAVA.LANG.ENUM
 */
public enum Method {
    POST,
    GET,
    DELETE
}

class Test{
    public static void main(String[] args) {
        Method get = Method.GET;
        System.out.println(get);
    }
}