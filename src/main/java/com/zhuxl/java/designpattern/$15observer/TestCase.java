package com.zhuxl.java.designpattern.$15observer;

public class TestCase {
    public static void main(String[] args) {
        Subject subject = new MySubject();
        subject.add(new ObserverA());
        subject.add(new ObserverB());

        subject.operation();
    }
}
