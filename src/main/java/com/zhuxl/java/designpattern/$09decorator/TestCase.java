package com.zhuxl.java.designpattern.$09decorator;

public class TestCase {
    public static void main(String[] args) {
        Decorator decorator = new Decorator(new Pan());

        decorator.cookDish();
        decorator.cookSoup();
    }
}
