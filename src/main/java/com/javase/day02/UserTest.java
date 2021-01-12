package com.javase.day02;

/**
 * ClassName:UserTest
 * Package:com.javase.day02
 * Description:
 *
 * @date:2020/7/20 13:53
 * @author:zh
 */

/**
 * 类中属性的使用
 * @author Admin
 *
 * 属性（成员变量） vs  局部变量
 * 1.相同点
 *  定义变量的格式 数据类型 变量名=变量值
 *  先声明 后使用
 *  变量都有其对应的作用域
 * 2.不同点
 *  2.1：在类中声明的位置不同
 *      属性：直接定义在类的一对{}内
 *      局部：声明在方法内/方法形参/代码块/构造器形参/构造器内部的变量
 *  2.2：关于权限修饰符的不同
 *      属性：可以在声明属性时，指明其权限，使用权限修饰符（常用的权限修饰符：prviate/public/缺省/protected
 *      局部变量：不可以使用权限修饰符
 *  2.3：默认初始化值的情况
 *      属性：类的属性，根据其类型，都有默认初始化值
 *      局部：无初始化值 意味在调用时 需赋值
 *  2.4：在内存中加载的位置：
 *      属性：加载到堆空间（非static)
 *      局部：加载到栈空间
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        //成员变量都有初始值
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.isMale);
    }
}

class User{
    //属性（成员变量）
    String name="张煌";
    int age;
    boolean isMale;

    public void talk(String language){//language :形参 局部变量
        System.out.println("我们使用"+language);
    }

    public void eat(){
        String food="老表";//局部变量
        System.out.println("快手直播"+food);
    }
}