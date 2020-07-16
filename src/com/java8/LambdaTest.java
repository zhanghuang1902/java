package com.java8;

public class LambdaTest {

    public static void main(String[] args) {
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                System.out.println("我爱 java");
            }
        };
        runnable.run();
        System.out.println("======");
        Runnable r2=()-> System.out.println("我爱python");
        r2.run();
    }
}
