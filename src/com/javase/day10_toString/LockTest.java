package com.javase.day10_toString;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题3 ：lock锁 5.0新增
 * 1.面试题：syschornized（隐藏锁） 和lock（显示锁）  有什么区别：
 * 相同点：都能解决线程安全问题
 * 不同点：sys 机制在执行完 相应的同步代码后，自动的释放同步监视器
 *         lock 需要手动的启动 lock()  同时需要手动实现unlock()
 *
 * 解决安全问题顺序：Lock-同步代码块-同步方法
 */
public class LockTest {
    public static void main(String[] args) {
        lockMethod method = new lockMethod();
        Thread method1 = new Thread(method);
        Thread method2 = new Thread(method);
        Thread method3 = new Thread(method);
        method1.setName("窗口1");
        method2.setName("窗口2");
        method3.setName("窗口3");
        method1.start();
        method2.start();
        method3.start();
    }
}


class lockMethod implements Runnable{
    private int ticket =100;
//手动创建安全锁的机制
    private ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            try {
                //加锁
                lock.lock();
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+":"+ticket);
                    ticket--;
                }else {
                    break;
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                //解锁
                lock.unlock();
            }

        }
    }
}
