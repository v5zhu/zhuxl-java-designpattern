package com.zhuxl.java.designpattern.$22mediator;

public class Renter extends Person {

    public Renter(Mediator mediator) {
        super(mediator);
    }

    @Override
    double trade() {
        System.out.println("房客给一半中介费750");
        return 750;
    }
}
