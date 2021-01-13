package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * ClassName:LambdaTestUser
 * Package:com.java8
 * Description:
 *
 * @date:2021/1/11 14:13
 * @author:zh
 */
public class LambdaTestUser {

    public static void main(String[] args) {
        User user = new User("张煌", "20", "1");
        User user1 = new User("1", "21", "1");
        User user2 = new User("2", "22", "2");
        User user3 = new User("3", "23", "3");
        User user4 = new User("4", "24", "1");
        User user5 = new User("5", "25", "2");
        User user6 = new User("6", "26", "4");
        User user7 = new User("7", "27", "5");
        User user8 = new User("8", "28", "1");
        User user9 = new User("9", "29", "5");
        User user10 = new User("10", "30", "4");
        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        list.add(user7);
        list.add(user8);
        list.add(user9);
        list.add(user10);
        Map<String, List<User>> map = list.stream().collect(Collectors.groupingBy(User::getClassId));
        map.forEach((o1,o2)->{
            System.out.println(o1);
            o2.forEach(item-> System.out.println(item.toString()));
        });
        Set<Map.Entry<String, List<User>>> set = map.entrySet();
        for (Map.Entry<String, List<User>> entry : set) {
            String key = entry.getKey();
            List<User> value = entry.getValue();
            value.forEach(item-> System.out.println(item.toString()));
        }
        Map<String, User> collect = list.stream().collect(Collectors.toMap(User::getName, item->item));
    }
}
