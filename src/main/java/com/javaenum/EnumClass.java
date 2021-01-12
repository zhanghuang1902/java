package com.javaenum;

/**
 * ClassName:EnumClass
 * Package:com.javaenum
 * Description:
 *
 * @date:2020/9/15 16:37
 * @author:zh
 *
 * 枚举类的使用：
 * 1.有限个且数量确定
 * 2.当需要定义一组常量时，强烈建议使用枚举类
 * 3.如果枚举类中只有一个对象，则可以作为单例模式的实现方式
 *
 * 定义枚举类
 * 方式1：jdk5.0之前，自定义枚举类
 * 方式2:jdk5.0 ,可以使用enum关键字定义枚举类
 */
public enum EnumClass {

    WRITE("上午"),
    EVEING("下午"),
    TEXT("晚上");

    private final String desc;

    EnumClass(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Day{" +
                "desc='" + desc + '\'' +
                '}';
    }

}

//自定义枚举类
class Season{
    //声明Season对象的属性
    private final String seasonName;
    private final String seasonDesc;
    //1.私有化类的构造器
    private Season(String seasonName, String seasonDesc){

        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    //3.提供当前枚举类的多个对象
    public static final Season SPRING=new Season("春天","春暖花开");
    public static final Season SUMMER=new Season("夏天","夏日炎炎");
    public static final Season AUTUMN=new Season("秋天","秋高气爽");
    public  static final Season WINTER=new Season("冬天","冰天雪地");
}
class status{
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        EnumClass write = EnumClass.WRITE;
        System.out.println(write);
        System.out.println(autumn);
    }
}
