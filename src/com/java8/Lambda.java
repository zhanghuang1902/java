package com.java8;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.Consumer;

public class Lambda{

    @Test
    public  void test1() {
        Runnable info=new Runnable() {
            @Override
            public void run() {
                System.out.println("测试无参无返回值");
            }
        };
        info.run();
        System.out.println("=====");
        Runnable info2=()->{System.out.println("lambda 测试");};
        info2.run();
    }

    @Test
    public  void test2() {
        Consumer<String> info =new Consumer<String>(){
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        info.accept("有参数，无返回值");
        System.out.println("=====");
        Consumer<String> info2=(String s )->{ System.out.println(s);};
        info2.accept("lambda写法");
    }

    @Test
    public  void test3() {
        Consumer<String> info2=(String s )->{ System.out.println(s);};
        info2.accept("lambda写法");
        System.out.println("=====");
        Consumer<String> info3=(s) -> {System.out.println(s);};
        info3.accept("类型维护");
        System.out.println("=====");
        PrintStream out = System.out;
        Consumer<String> info4= out::println;
        info4.accept("方法引用");
    }

    @Test
    public  void test4() {
        //Comparator 中的int compare（T  t1,T  t2)
        //Integer 中的int compare（T  t1,T  t2)
        Comparator<Integer> info=(o1, o2) -> Integer.compare(o1,o2);
        System.out.println(info.compare(12,21));
        System.out.println("=====");
        Comparator<Integer> info2=Integer::compare;
        System.out.println(info2.compare(12,21));
    }

    @Test
    public  void test5() {
        //Comparator 中的int compare（T  t1,T  t2)
        //String 中的int t1.compareto（t2)
        //对象：：非静态方法的使用
        //对比发现， 第一个参数调用第二个参数 可以这么使用
        Comparator<String> info=(o1, o2) -> o1.compareTo(o2);
        System.out.println(info.compare("12","21"));
        System.out.println("=====");
        Comparator<String> info2=String::compareTo;
        System.out.println(info2.compare("12","21"));
    }


}
