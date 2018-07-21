package com.zhuxl.java.designpattern.$23interpreter;

/**
 * 解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等
 */
public interface Expression {

    int interpreter(Content content);
}