package com.demo.listener;

public class observerAImpl implements Observer {

    @Override
    public void update() {
        System.out.println("观察者A收到通知");
    }
}
