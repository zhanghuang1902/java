package com.mycode;

import com.mycode.bean.User;

/**
 * ClassName:MyCode
 * Package:com.mycode
 * Description:
 *
 * @date:2020/12/29 11:11
 * @author:zh
 */
public class MyCode {

    public static void main(String[] args) {
        User user = new User("张煌", "20");
        User user1 = new User("张煌", "20");
        if(user.equals(user1)){
            System.out.println("ok");
        }
    }
}
