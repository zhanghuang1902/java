package com.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    @Test
    public void test1(){
        List<String> info = new ArrayList<>();
        info.add("张三");
        info.add("王宇");
        info.add("马欢");
        info.add("马云");
        info.add("张强");
        
        //创建Stream 方式一：通过集合
        //返回一个顺序流(按数据源的顺序进行操作）
        java.util.stream.Stream<String> stream = info.stream();
        //返回一个并行流（多线程操作数据源）
        java.util.stream.Stream<String> stringStream =  info.parallelStream();

        //创建Stream 方式二：通过数组
        int[] arr=new int[]{1,2,3,4,5,6};
        final IntStream stream1 = Arrays.stream(arr);

        //创建Stream方式三;  通过stream的of方法
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);

        //创建Stream方式四：创建无线流
        //1.迭代  前10个偶数
        Stream.iterate(0,t->t+2).limit(10).forEach(System.out::println);

        //2.生成  随机10个数
        Stream.generate(Main::new).limit(10).forEach(System.out::println);

    }

    @Test
    public void test2(){
        //中间操作
        //1.筛选与切片
        //方法：filter(过滤)  limit(取前几位） skip(跳过前几位） distinct(去重）
        List<String> info = new ArrayList<>();
        info.add("张三");
        info.add("王宇");
        info.add("马欢");
        info.add("马云");
        info.add("张强");
        info.add("张强");
        info.add("张强");
        info.add("张强");
        //选出含“马”的人物
        info.stream().filter(item->item.contains("马")).forEach(System.out::println);
        System.out.println("=======");
        //取前3位
        info.stream().limit(3).forEach(System.out::println);
        System.out.println("=======");
        //跳过前3位
        info.stream().skip(3).forEach(System.out::println);
        System.out.println("=======");
        //去初重复项
        info.stream().distinct().forEach(System.out::println);
    }

    @Test
    public void test3(){
        //中间操作
        //2.映射  (一对一的关系，将集合里面的元素按照自己的逻辑 整合到一起，形成一个新的集合）
        //方法：map flatMap
        List<String> info = new ArrayList<>();
        info.add("aa");
        info.add("bb");
        info.add("cc");
        info.add("dd");
        info.add("aa");
        info.add("aa");
        //将集合的小写都换成大写集合
        info.stream().map(item->item.toUpperCase()).forEach(System.out::println);
        //判断是否还有aa 集合
        System.out.println("=======");
        info.stream().map(item->item.contains("aa")).forEach(System.out::println);
        //flatMap
        //相当于list 中的addAll 方法 将一个流元素直接打散放到一个新的流中
        //举例
        //[a,a,a,a [a,a,a]] map 操作
        //[a,a,a,a,a,a,a]  flatMap操作
    }

    @Test
    public void test4(){
        //排序
        //sorted 排序 如果对象实现Comparable接口 则默认升序排序
        //如果没有实现，需传参数去定义比较
        List<Integer> info = new ArrayList<>();
        info.add(1);
        info.add(5);
        info.add(10);
        info.add(11);
        info.add(7);
        info.stream().sorted().forEach(System.out::println);
        System.out.println("=======");
        //参数顺序相反 降序排列  参数顺序相同升序排列
        info.stream().sorted((e1,e2)->Integer.compare(e2,e1)).forEach(System.out::println);
    }
}
