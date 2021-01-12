package com.javacollection.ArraysList;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:ArraysListTest
 * Package:com.javacollection.ArraysList
 * Description:
 *
 * @date:2020/9/23 10:15
 * @author:zh
 */
public class ArraysListTest {
    public static void main(String[] args) {
            List<String> list = new ArrayList<>(30);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add(1, "haha");
        System.out.println(list);

        Integer b= 10000;
        Integer c=10000;
        Integer e=100;
        Integer f=100;
        System.out.println(e==f);
        System.out.println(b==c);
    }
}
