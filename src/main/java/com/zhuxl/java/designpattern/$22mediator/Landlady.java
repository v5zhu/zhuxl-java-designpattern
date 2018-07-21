package com.zhuxl.java.designpattern.$22mediator;

public class Landlady extends Person {

    public Landlady(Mediator mediator) {
        super(mediator);
    }

    @Override
    double trade() {
        System.out.println("女房东给一半中介费750");
        return 750;
    }
}
