 package com.javase.day11_thread;

/**
 * 创建多线程的方式2
 * 1.创建一个实现Runnable 接口的类
 * 2.实现类去实现Runnable中的抽象方法 run();
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5.通过Thread类的对象调用start()
 *
 *
 * 衍生线程安全问题：
 * 卖票重复问题：
 * 原因：当某个线程在操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票
 * 解决：当一个线程在操作车票时，其他线程不能参与进来，直到线程操作完毕，其他线程才能继续操作。
 * 方案：同步机制
 *  1.同步代码块
 *      synchronized(同步监视器){
 *          //需要被同步的代码
 *      }
 *
 *   说明：1.操作共享数据的代码，即为需要被同步的代码
 *         2.共享数据：多个线程共同操作的变量，比如：ticket就是共享数据
 *         3.同步监视器  俗称：锁   任何一个对象都可以充当锁  要去：多个线程必须共用一把锁
 *
 *
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


