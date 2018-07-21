package com.zhuxl.java.designpattern.$15observer;

public interface Subject {

    void add(Observer observer);

    void remove(Observer observer);

    void notifyAllObservers();

    void operation();
}
