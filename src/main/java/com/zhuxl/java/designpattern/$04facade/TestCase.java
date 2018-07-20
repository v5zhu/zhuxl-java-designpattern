package com.zhuxl.java.designpattern.$04facade;

public class TestCase {
    public static void main(String[] args) {
        Computer computer=new Computer();

        computer.start();

        computer.working();

        computer.shutdown();
    }
}
