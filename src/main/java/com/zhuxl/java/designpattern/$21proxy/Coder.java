package com.zhuxl.java.designpattern.$21proxy;

/**
 * 基于面向对象的思想，首先定义一个码农接口,它有一个实现用户需求的方法
 */
public interface Coder {
    void implementRequirement(String requireName);

    void sleep();
}
