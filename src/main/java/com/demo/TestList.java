package com.demo;

import org.junit.Test;

import java.util.ArrayList;

public class TestList {
    @Test
    public void test() {
        ArrayList<Object> testList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            testList.add(String.valueOf(i));
        }
        for (int i = 1; i <= 10; i++) {
            testList.add(String.valueOf(i));
        }


        System.out.println("内容:");
        testList.forEach(t -> System.out.println(t));


        System.out.println("list 双循环 开始去重，条数：" + testList.size());
        for (int i = 0; i < testList.size(); i++) {
            for (int j = i + 1; j < testList.size(); j++) {
                if (testList.get(i).equals(testList.get(j))) {
                    testList.remove(j);
                }
            }
        }
        System.out.println("list 双循环  去重完毕，条数：" + testList.size());
    }
}
