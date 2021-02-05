package com.reflection.code;

import com.reflection.bean.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ClassName:Reflection
 * Package:com.reflection.code
 * Description:
 *
 * @date:2021/2/5 15:04
 * @author:zh
 */
public class Reflection {

    public static void main(String[] args) throws Exception {
        Class<User> userClass = User.class;
        //获取方法
        Method play = userClass.getDeclaredMethod("play");
        play.invoke(userClass.newInstance());
        User user1 = userClass.newInstance();
        //获取属性
        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field.getName());
            field.setAccessible(true);
            if(field.getName().equals("name")){
                field.set(user1, "谢喆");
            }else {
                field.set(user1, "10");
            }
        }
        System.out.println(user1.toString());
        String name = userClass.getName();
        //获取构造
        Constructor<User> constructor = userClass.getConstructor();
        User user = constructor.newInstance();
        user.setAge("20");
        user.setName("张煌");
        System.out.println(user.toString());
        System.out.println(name);
    }
}
