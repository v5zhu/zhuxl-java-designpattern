package com.zhuxl.java.designpattern.$15observer;

public class MySubject extends AbstractSubject {


    @Override
    public void operation() {
        System.out.println("updated self , notify others");
        notifyAllObservers();
    }
}
