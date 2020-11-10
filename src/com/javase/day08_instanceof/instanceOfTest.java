package com.javase.day08_instanceof;

/**
 * @author Admin
 */
public class instanceOfTest {

    public static void main(String[] args) {
        Mother mother = new Mother();
        Father father = new Father();
        Son son = new Son();
        Father father2 =new Son();
        father2.watch();
        if(mother instanceof  Person){
            System.out.println("yes");
        }
        if(father instanceof Person){
            System.out.println("yes");
        }
        if(son instanceof Person){
            System.out.println("yes");
        }
        //编译报错
        //x instanceof A :
        //要求 x 所属的类与类A必须是子类和父类的关系，否则编译报错
        //如果x 属于类A的子类B ，X instanceof A 也为true
//        if(mother instanceof Father){
//            System.out.println("yes");
//        }
    }

}
