package com.javase.day11_thread;

/**
 * @author 97083
 * 方式一：
 * 继承thread类
 * 1.创建一个继承于thread类的子类
 * 2.重写thread类的run()
 * 3.创建thread类的子类的对象
 * 4.通过此对象调用start()
 */
public class ThreadTest {

    public static void main(String[] args) {
        //3.创建thread类的子类的对象
        MyThread t1 = new MyThread();
        t1.start();
        //我们不可以直接调用.run()的方式启动线程
//        t1.run();
        //不可以再启动一个线程，否则会报异常 除非在new 一个子类对象t2，去调用
        t1.start();
        System.out.println("hello");
        for(int i=0;i<1000;i++){
            if(i%2!=0){
                System.out.println(i+"haha");
            }
        }
    }

}
//1.创建一个子类继承thread
class MyThread extends Thread{
    //2.重写run方法
    @Override
    public void run() {
       for(int i=0;i<100;i++){
           if(i%2==0){
               System.out.println(i);
           }
       }
    }
}
