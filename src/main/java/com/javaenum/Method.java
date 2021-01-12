package com.javaenum;

/**
 * ClassName:Method
 * Package:com.javaenum
 * Description:
 *
 * @date:2020/9/15 17:20
 * @author:zh
 * 枚举类的父类 时  JAVA.LANG.ENUM
 *
 * 枚举类常用方法
 * toString
 * values
 * valuesof
 */
public enum Method implements Message {
    POST{
        @Override
        public void show() {
            System.out.println("发送");
        }
    },
    GET{
        @Override
        public void show() {
            System.out.println("获取");
        }
    },
    DELETE {
        @Override
        public void show() {
            System.out.println("删除");
        }
    };


    @Override
    public void show() {
        System.out.println("重写");
    }
}

interface  Message{
    void show();
}

@MyAnnotation
class Test{
    public static void main(String[] args) {
        Method get = Method.GET;
        //toString
        System.out.println(get.toString());
        //values
        Method[] values = Method.values();
        for (Method value : values) {
            System.out.println(value.toString());
        }
        //线程状态
        //新建new 就绪 runnable 运行 running 阻塞 blocked 死亡 Dead
        Thread.State[] values1 = Thread.State.values();
        for (Thread.State state : values1) {
            System.out.println(state);
        }
        //valueOf(String name)
        //返回枚举类种对象名是objName的对象
        Method get1 = Method.valueOf("GET");
        get1.show();
        System.out.println(get1);
    }
}