package com.demo.listener;

public class Test {
    public static void main(String[] args) {
        subjectImpl s = new subjectImpl();
        s.registerObserver(new observerAImpl());
        s.registerObserver(new observerBImpl());

        s.doSometing();
    }


}
