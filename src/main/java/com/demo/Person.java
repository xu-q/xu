package com.demo;

import lombok.Data;

@Data
public class Person {

    private String name;

    private Integer age;

    private int birthday;

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", birthday=" + birthday + '}';
    }
}
