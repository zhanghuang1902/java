package com.javase.day10_toString;

/**
 * @author 97083
 *
 * 线程安全问题：
 *  * 卖票重复问题：
 *  * 原因：当某个线程在操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票
 *  * 解决：当一个线程在操作车票时，其他线程不能参与进来，直到线程操作完毕，其他线程才能继续操作。
 *  * 方案：同步机制
 *  *  1.同步代码块
 *  *      synchronized(同步监视器){
 *  *          //需要被同步的代码
 *  *      }
 *  *
 *  *   说明：1.操作共享数据的代码，即为需要被同步的代码
 *  *         2.共享数据：多个线程共同操作的变量，比如：ticket就是共享数据
 *  *         3.同步监视器  俗称：锁   任何一个对象都可以充当锁  要去：多个线程必须共用一把锁
 *  *2.同步方法  在方法的前面加 synchornized  Runnable 中的syschornized  不用static修饰 Thread 需要用static 修饰
 */
public class ThreadTicked {
    public static void main(String[] args) {
        Method method1 = new Method();
        Method method2 = new Method();
        Method method3 = new Method();
        method1.setName("窗口1");
        method1.start();
        method2.setName("窗口2");
        method2.start();
        method3.setName("窗口3");
        method3.start();
    }


}

class Method  extends Thread {
    private static int ticket=100;
    private static  Integer object=10;
    public void run() {
        try {
            while (true){
                //锁必须唯一  或者Window2.class
                synchronized (object){
                    if(ticket>0){
                        System.out.println(getName()+"：卖票：票号为： "+ticket);
                        ticket--;
                    }else{
                        break;
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
