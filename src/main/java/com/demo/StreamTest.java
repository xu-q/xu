package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu(1, "根节点", 0));
        menuList.add(new Menu(2, "子节点1", 1));
        menuList.add(new Menu(3, "子节点1.1", 2));
        menuList.add(new Menu(4, "子节点1.2", 2));
        menuList.add(new Menu(5, "根节点1.3", 2));
        menuList.add(new Menu(6, "根节点2", 1));
        menuList.add(new Menu(7, "根节点2.1", 6));
        menuList.add(new Menu(8, "根节点2.2", 6));
        menuList.add(new Menu(9, "根节点2.2.1", 7));
        menuList.add(new Menu(10, "根节点2.2.2", 7));
        menuList.add(new Menu(11, "根节点3", 1));
        menuList.add(new Menu(11, "根节点3.1", 11));
        menuList.add(new Menu(11, "根节点3.2", 11));
        Map<Integer, Menu> map = menuList.stream().collect(Collectors.toMap(Menu::getId, Function.identity(), (k1, k2) -> k1));
        map.values().forEach(m -> System.out.println(m));

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        List<Menu> list = menuList.stream().filter(m -> m.id > 5).collect(Collectors.toList());
        list.forEach(l -> System.out.println(l));

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        Map<Integer, List<Menu>> collect = menuList.stream().collect(Collectors.groupingBy(Menu::getId));
        collect.forEach((k,v) -> System.out.println("k:"+k+"v:"+v));

        int sum = Stream.of(1, 2, 3, 4)
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
