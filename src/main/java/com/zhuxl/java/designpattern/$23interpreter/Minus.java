package com.zhuxl.java.designpattern.$23interpreter;

public class Minus implements Expression {
    @Override
    public int interpreter(Content content) {
        return content.getNum1() - content.getNum2();
    }
}
