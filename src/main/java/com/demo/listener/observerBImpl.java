package com.demo.listener;

public class observerBImpl implements Observer{
    @Override
    public void update() {
        System.out.println("观察者B收到通知");
    }
}
