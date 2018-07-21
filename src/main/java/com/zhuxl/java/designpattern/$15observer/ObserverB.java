package com.zhuxl.java.designpattern.$15observer;

public class ObserverB implements Observer{
    @Override
    public void update() {
        System.out.println("B receive message and updated");
    }
}
