package com.zhuxl.java.designpattern.$14templatemethod;


public class TestCase {
    public static void main(String[] args) {
        AbstractCalculator plus = new PlusCalculator();
        AbstractCalculator minus = new MinusCalculator();
        AbstractCalculator multiply = new MultiplyCalculator();

        System.out.println(plus.calc("10+20", "\\+"));
        System.out.println(minus.calc("10-20", "\\-"));
        System.out.println(multiply.calc("10*20", "\\*"));

    }


}
