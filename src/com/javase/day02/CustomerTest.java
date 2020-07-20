package com.javase.day02;

/**
 * ClassName:CustomerTest
 * Package:com.javase.day02
 * Description:
 *
 * @date:2020/7/20 16:35
 * @author:zh
 */

/**
 * 类中方法的声明和使用
 * 方法：描述类应该具有的功能
 * @author Admin
 *
 * 方法的声明：权限修饰符 返回值类型 方法名（形参列表）{
 *     方法体
 *      }
 * 说明：权限修饰符：
 *          private public 缺省 protected
 *      返回值类型：
 *              1.如果方法有返回值，则必须在方法声明时，指定返回值类型，同时需要使用return 返回返回值类型
 *              2.如果方法无返回值，则方法声明时，使用void来表示 方法中不需要使用return，或直接使用"return;"
 *      方法名： 属于标识符 见名知意
 *      形参列表：可以0~多个
 *      方法体：加工厂
 * return关键字使用：
 *  1.使用范围：方法体
 *  2.作用：结束方法；有返回值 如return  返回类型数据
 *  3.return 后面不能添加执行语句；
 *
 *  方法的使用：1.可以调用当前类的属性和方法
 *            2.方法中不可以在定义另一个方法
 *      特殊使用：在方法A中调用方法A（递归方法）
 */
public class CustomerTest {
}

class Customer{
    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("客户吃饭");
    }

    public void sleep(String hour){
        System.out.println("休息了"+hour+"个小时");
    }

    public String getName(){
        return name;
    }

    public String getNation(String nation){
        String info="我的国籍是： "+nation;
        return info;
    }
}