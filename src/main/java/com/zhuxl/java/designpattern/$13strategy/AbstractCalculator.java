package com.zhuxl.java.designpattern.$13strategy;

public abstract class AbstractCalculator {
    int[] split(String expression, String separator) {
        String[] nums = expression.split(separator);
        int[] ints = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ints[i] = Integer.parseInt(nums[i]);
        }
        return ints;
    }
}
