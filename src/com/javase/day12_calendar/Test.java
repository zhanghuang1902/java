package com.javase.day12_calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {

    public static void main(String[] args) {
// System.out.println(new Test().getNextSunday());
        Test test = new Test();
        Calendar start = Calendar.getInstance();
        start.setTime(test.getPreviousMonday());
        Long startTIme = start.getTimeInMillis();



        Calendar end = Calendar.getInstance();
        end.setTime(test.getPreviousSunday());
        Long endTime = end.getTimeInMillis();


        Long oneDay = 1000 * 60 * 60 * 24l;


        Long time = startTIme;
        while (time <= endTime) {
            Date d = new Date(time);
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(df.format(d));
            time += oneDay;
        }
    }


    // 用来全局控制 上一周，本周，下一周的周数变化
    private static int weeks = 0;


    // 获得当前日期与本周一相差的天数
    private int getMondayPlus() {
        Calendar cd = Calendar.getInstance();
// 获得今天是一周的第几天，星期日是第一天，星期二是第二天
        int dayOfWeek = cd.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == 1) {
            return -6;
        } else {
            return 2 - dayOfWeek;
        }
    }


    // 获得上周星期一的日期
    public Date getPreviousMonday() {
        weeks--;
        int mondayPlus = this.getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + 7 * weeks);
        Date monday = currentDate.getTime();
        return monday;
    }


    // 获得上周星期日的日期
    public Date getPreviousSunday() {
// weeks--;
        int mondayPlus = this.getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + 7 * weeks + 6);
        Date monday = currentDate.getTime();
        return monday;
    }


    // 获得本周星期一的日期
    public Date getCurrentMonday() {
        weeks = 0;
        int mondayPlus = this.getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus);
        Date monday = currentDate.getTime();
        return monday;
    }


    // 获得下周星期一的日期
    public Date getNextMonday() {
        weeks++;
        int mondayPlus = this.getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + 7 * weeks);
        Date monday = currentDate.getTime();
        return monday;
    }


    // 获得下周星期一的日期
    public Date getNextSunday() {
        weeks++;
        int mondayPlus = this.getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + 7 * weeks + 6);
        Date monday = currentDate.getTime();
        return monday;
    }


    // 获得本周的周日的日期
    public Date getSunday() {
        int mondayPlus = this.getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + 7 * weeks + 6);
        Date monday = currentDate.getTime();
        return monday;
    }


}
