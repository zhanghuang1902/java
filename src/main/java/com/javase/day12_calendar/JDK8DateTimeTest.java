package com.javase.day12_calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * ClassName:JDK8DateTimeTest
 * Package:com.javase.day12_calendar
 * Description:
 *
 * @date:2020/9/10 14:15
 * @author:zh
 */
public class JDK8DateTimeTest {

    public static void main(String[] args) {
        //LocalDate
        //LocalTime
        //LocalDateTime
        //方法 : now 获取当前时间 日期  时间+日期
        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);

        //of() 设置指定的年月日时分秒 没有偏移量
        LocalDateTime dateTime = LocalDateTime.of(2020, 9, 10, 14, 33,50);
        System.out.println(dateTime);
        LocalDate of = LocalDate.of(2040, 10, 1);
        System.out.println(of);

        //get  获取时分秒
        System.out.println(now2.getMinute());
        DayOfWeek day = now2.getDayOfWeek();
        System.out.println(day+"00000000");

        //with(set) 不可变性 设置时间值
        LocalDate localDate = now.withDayOfMonth(11);
        System.out.println(now);
        System.out.println(localDate);

        //push  增加时间
        LocalDate localDate1 = now.plusMonths(3);
        System.out.println(localDate1);
        System.out.println(now);

        //minus  减少时间
        LocalDate localDate2 = now.minusMonths(1);
        System.out.println(localDate2);
    }
}
