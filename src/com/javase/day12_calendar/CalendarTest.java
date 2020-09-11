package com.javase.day12_calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * ClassName:Calendar
 * Package:com.javase.day12_calendar
 * Description:
 *
 * @date:2020/9/9 15:07
 * @author:zh
 * 日历类(抽象类,不可直接创建对象)
 */
public class CalendarTest {

    public static void main(String[] args) {
        //1.实例化
        //方式1  创建子类对象 GregorianCalendar
        //方式2  调用其静态方法
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.getClass());
        //常用方法:
        //get()
        int i = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);
        System.out.println(instance.get(Calendar.DAY_OF_YEAR));
        //set()
        instance.set(Calendar.DAY_OF_MONTH, 22);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        //add()
        instance.add(Calendar.DAY_OF_MONTH, 3);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        //getTime() 日历类装换 成Date
        Date time = instance.getTime();
        //setTime() date 转换成日历类
        Date date = new Date();
        instance.setTime(date);

    }
}
