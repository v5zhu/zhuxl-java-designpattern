package com.zhuxl.java.designpattern.$14templatemethod;


public class MinusCalculator extends AbstractCalculator {

    @Override
    public int calc(int num1, int num2) {
        return num1 - num2;
    }
}
