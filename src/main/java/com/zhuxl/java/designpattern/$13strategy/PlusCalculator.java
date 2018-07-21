package com.zhuxl.java.designpattern.$13strategy;

public class PlusCalculator extends AbstractCalculator implements Calculator {
    @Override
    public int calc(String expression) {
        int[] nums = split(expression, "\\+");
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result += nums[i];
        }
        return result;
    }
}
