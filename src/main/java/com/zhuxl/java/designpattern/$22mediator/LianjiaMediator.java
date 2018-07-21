package com.zhuxl.java.designpattern.$22mediator;

public class LianjiaMediator implements Mediator {
    private Person landlady;

    private Person renter;


    @Override
    public void createContract() {
        System.out.println("中介建立房东与租客的联系");
        this.landlady = new Landlady(this);
        this.renter = new Renter(this);
    }

    @Override
    public double trade() {
        System.out.println("中介收取1500元中介费");
        return landlady.trade() + renter.trade();
    }

    public Person getLandlady() {
        return landlady;
    }

    public void setLandlady(Person landlady) {
        this.landlady = landlady;
    }

    public Person getRenter() {
        return renter;
    }

    public void setRenter(Person renter) {
        this.renter = renter;
    }
}
