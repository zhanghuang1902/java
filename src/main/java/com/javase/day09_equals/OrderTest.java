package com.javase.day09_equals;

/**
 * @author 97083
 */
public class OrderTest {

    public static void main(String[] args) {
        Order tom = new Order(10, "Tom");
        Order tom1 = new Order(10, "Tom");
        Order tom2 = new Order(10, new String("Tom"));

        String tom3 = new String("Tom");
        String tom4="Tom";
        if (tom3.equals(tom4)) {
            System.out.println("辅导费");
        }
        if(tom.equals(tom1)){
            System.out.println("ojbk");
        }
        if(tom1.equals(tom2)){
            System.out.println("ojbk2");
        }
    }
}
