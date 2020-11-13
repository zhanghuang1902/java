package com.java8;

import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ClassName:StreamMethod
 * Package:com.java8
 * Description:
 *
 * @date:2020/11/12 16:32
 * @author:zh
 */
public class StreamMethod {

    public static void main(String[] args) {
        List<PersonStream> list = new ArrayList<>();
        list.add(new PersonStream("Tom", 8900, 23, "male", "New York"));
        list.add(new PersonStream("Jack", 7000, 25, "male", "Washington"));
        list.add(new PersonStream("Lily", 7800, 21, "female", "Washington"));
        list.add(new PersonStream("Anni", 8200, 24, "female", "New York"));
        list.add(new PersonStream("Owen", 9500, 25, "male", "New York"));
        list.add(new PersonStream("Alisa", 7900, 26, "female", "New York"));

        Map<String, PersonStream> collect2 = list.stream().filter(item -> item.getSalary() > 8000).collect(Collectors.toMap(PersonStream::getName, item -> item));
        //筛选员工中工资高于8000的人，并形成新的集合。
        List<PersonStream> collect = list.stream().filter(item -> item.getSalary() > 8000).collect(Collectors.toList());
        System.out.println(collect);
        //获取员工工资最高的人
        Optional<PersonStream> max1 = list.stream().max(Comparator.comparingInt(PersonStream::getSalary));
        System.out.println(max1.get().getSalary());
        List<Integer> asList = Arrays.asList(7, 6, 9, 3, 8, 2, 1);
        Optional<Integer> max = asList.stream().max(Integer::compareTo);
        System.out.println(max.get());
        System.out.println("****************");
        //过滤大于6的元素
        asList.stream().filter(x->x>6).forEach(System.out::println);
        //第一个大于6的元素
        Optional<Integer> first = asList.stream().filter(item -> item > 6).findFirst();
        //任意一个
        Optional<Integer> any = asList.stream().parallel().filter(item -> item > 6).findAny();
        //是否包含此元素
        boolean b = asList.stream().anyMatch(item -> item > 10);
        System.out.println("****************");
        System.out.println(first.get());
        System.out.println("****************");
        System.out.println(any.get());
        System.out.println("****************");
        System.out.println(b);

        List<String> strings = Arrays.asList("m,k,l,a", "1,3,5,7");
        List<String> collect1 = strings.stream().flatMap(item -> {
            String[] split = item.split(",");
            Stream<String> stream = Arrays.stream(split);
            return stream;
        }).collect(Collectors.toList());
        System.out.println(collect1);
    }

}
