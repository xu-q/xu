package com;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "3");
        map.put("c", "4");
        map.put(null, "2");
        map.put("d", "5");
        System.out.println(map);
    }
}