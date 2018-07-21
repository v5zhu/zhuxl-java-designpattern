package com.zhuxl.java.designpattern.$03facade;

public class TestCase {
    public static void main(String[] args) {
        Computer computer=new Computer();

        computer.start();

        computer.working();

        computer.shutdown();
    }
}
