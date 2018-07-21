package com.zhuxl.java.designpattern.$10bridge;

public class DriverManagerBridge {

    private Driver driver;

    public void connection() {
        driver.connection();
    }


    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return this.driver;
    }
}
