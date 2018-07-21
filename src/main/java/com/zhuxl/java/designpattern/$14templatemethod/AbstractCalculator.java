package com.zhuxl.java.designpattern.$14templatemethod;

/**
 * 解释一下模板方法模式，就是指：一个抽象类中，有一个主方法，再定义1...n个方法，
 * 可以是抽象的，也可以是实际的方法，定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用
 */
public abstract class AbstractCalculator {
    int[] split(String expression, String separator) {
        String[] nums = expression.split(separator);
        int[] ints = new int[nums.length];
        ints[0] = Integer.parseInt(nums[0]);
        ints[1] = Integer.parseInt(nums[1]);
        return ints;
    }

    public final int calc(String expression, String separator) {
        int[] nums = split(expression, separator);
        return calc(nums[0], nums[1]);
    }

    public abstract int calc(int num1, int num2);
}
