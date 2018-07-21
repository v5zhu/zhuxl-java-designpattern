package com.zhuxl.java.designpattern.$22mediator;

public abstract class Person {
    private Mediator mediator;

    public Person(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract double trade();

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
