package com.zhuxl.java.designpattern.$15observer;

public class ObserverA implements Observer{
    @Override
    public void update() {
        System.out.println("A receive message and updated");
    }
}
