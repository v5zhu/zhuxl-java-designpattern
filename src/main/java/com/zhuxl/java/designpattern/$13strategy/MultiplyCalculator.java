package com.zhuxl.java.designpattern.$13strategy;

public class MultiplyCalculator extends AbstractCalculator implements Calculator {
    @Override
    public int calc(String expression) {
        int[] nums = split(expression, "\\*");
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            result *= nums[i];
        }
        return result;
    }
}
