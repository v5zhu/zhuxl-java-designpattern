package com.zhuxl.java.designpattern.$23interpreter;

/**
 * 本例输出：
 * 9+2-8=3
 */
public class TestCase {
    public static void main(String[] args) {
        int result = new Minus().interpreter(new Content(new Plus().interpreter(new Content(9, 2)), 8));

        System.out.println("9+2-8=" + result);

    }
}
