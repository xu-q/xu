package com.demo.listener;

public interface subject {

    void registerObserver(Observer observer);

    void notifyObserver();
}
