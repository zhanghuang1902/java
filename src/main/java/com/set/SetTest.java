package com.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName:SetTest
 * Package:com.set
 * Description:
 *
 * @date:2020/9/24 14:43
 * @author:zh
 * Set接口：
 *  无序 不可重复的
 *  HashSet：作为Set接口的主要实现类，线程不安全的，可以存储null值
 *  1.无序性：不等于随机性。存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值进行排序的
 *  2.不可重复性：保证添加的元素按照equls()判断时，不能返回true.即相同的元素只能添加一个
    3.添加数据时，必须重写equls()  和hashcode()
    添加元素的过程:以HashSet为例：
    我们向HashSet中添加元素a,首先调用元素a所在类的hashCode()方法，计算元素a的哈希值
    此哈希值接着通过某种算法计算出在HashSet底层数组中的存放位置，判断数组此位置上是否已经有元素
    如果此位置上没有其他元素，则元素a添加成功
    如果此位置上有其他元素b,则比较元素a和元素b的hash值：
        如果hash值不相同，则元素a添加成功
        如果hash值相同，进而需要调用元素a所在类的equls()方法：
            equls()返回true,元素a添加失败
            equls()返回false,则元素a添加成功
 *      LinkedHashSet:作为HashSet的子类，遍其内部数据时，可以按照添加的顺序遍历
 *  TreeSet: 二叉树存储 可以按照添加的元素的指定属性，进行排序
 */
public class SetTest {
    @Test
    public void setTest(){
        Set hashSet = new HashSet();
        hashSet.add(456);
        hashSet.add(123456);
        hashSet.add("AAA");
        hashSet.add("bbb");
        hashSet.add(new User("张煌", 10));
        hashSet.add(new User("张煌", 10));
        System.out.println(hashSet.toString());
    }
}
