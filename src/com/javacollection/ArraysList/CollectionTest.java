package com.javacollection.ArraysList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName:CollectionTest
 * Package:com.javacollection
 * Description:
 *
 * @date:2020/9/17 16:25
 * @author:zh
 *
 * 集合框架概述
 * 1.集合/数组都是对多个数据进行存储操作的结构，简称java 容器
 * 2.说明:此时的存储，主要指的时内存层面的存储，不涉及到持久化的存储
 *
 * 2.数组在存储多个数据方面的特点
 *  1.初始化以后，长度确定
 *  2.必须指定数组的类型
 * 缺点：
 *      1.初始化以后，长度不可需改
 *      2.数组提供的方法有限，对于添加 删除 插入数据等操作 不方便，效率不高
 *      3.获取数组中的实际元素个数   数组们没有现成的属性或方法
 *      1.数组存储数据的特点时有序的/可重复，对于无序。不可重复的需求，不能满足
 *
 * 二/集合框架
 *  1.Collection接口：单例集合，用来存储一个一个的对象
 *      list：有序 可重复  --动态数据（可以扩容）
 *          ArrayList linkedList vector
 *      set：无需 不可重复  --
 *          Hashset linkedHashSet TreeSet
 *  2.Map接口：双列集合，用来存储键值对 --
 *         HashMap,linkedHashMap, TreeMap, Hashtable, Properties
 */
public class CollectionTest {
    @Test
    public void test(){
        String[] strings = new String[]{"aa","bb","cc","dd"};
        List<String> strings1 = Arrays.asList(strings);
        for (String s : strings1) {
            System.out.println(s);
        }
        Iterator<String> iterator = strings1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (int i = 0; i < strings1.size(); i++) {
            System.out.println(strings[i]);
        }
        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.println(strings[i]);
        }
    }
}
