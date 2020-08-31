package com.javase.day11_thread;

/**
 * 创建多线程的方式2
 * 1.创建一个实现Runnable 接口的类
 * 2.实现类去实现Runnable中的抽象方法 run();
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5.通过Thread类的对象调用start()
 */
public class RunnableTest {

    public static void main(String[] args) {
        RunnableMethod method = new RunnableMethod();
        Thread thread1 = new Thread(method);
        Thread thread2 = new Thread(method);
        thread1.setName("线程1");
        thread2.setName("线程2");
        thread1.start();
        thread2.start();
    }
}


class RunnableMethod implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println(Thread.currentThread().getName()+"i的值"+i);
        }
    }
}


