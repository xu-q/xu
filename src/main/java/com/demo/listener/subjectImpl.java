package com.demo.listener;

import java.util.ArrayList;
import java.util.List;


public class subjectImpl implements subject {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(Observer::update);
    }

    public void doSometing() {
        System.out.println("开始处理。。。");


        System.out.println("处理结束。。。");
        notifyObserver();
    }
}
