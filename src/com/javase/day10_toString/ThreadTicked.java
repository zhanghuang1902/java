package com.javase.day10_toString;

/**
 * @author 97083
 */
public class ThreadTicked {
    public static void main(String[] args) {
        Method method1 = new Method();
        Method method2 = new Method();
        Method method3 = new Method();
        method1.start();
        method2.start();
        method3.start();
    }


}

class Method  extends Thread {
    private static int ticket=100;
    @Override
    public void run() {
        try {
            sleep(1000);
            while (true){
                if(ticket>0){
                    System.out.println(getName()+"：卖票：票号为： "+ticket);
                    ticket--;
                }else{
                    break;
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
