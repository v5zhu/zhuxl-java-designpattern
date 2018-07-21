package com.zhuxl.java.designpattern.$13strategy;

public class TestCase {
    public static void main(String[] args) {
        Calculator plus = new PlusCalculator();
        Calculator minus = new MinusCalculator();
        Calculator multiply = new MultiplyCalculator();

        System.out.println(plus.calc("10+20+30+40+50+60+70+80+90+100"));
        System.out.println(minus.calc("10-20-30-40-50-60-70-80-90-100"));
        System.out.println(multiply.calc("10*20*30*40*50"));

    }


}
