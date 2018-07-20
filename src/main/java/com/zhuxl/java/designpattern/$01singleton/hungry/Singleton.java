package com.zhuxl.java.designpattern.$01singleton.hungry;

/**
 * 饿汉法
 * 顾名思义，饿汉法就是在第一次引用该类的时候就创建对象实例，而不管实际是否需要创建
 * 这样做的好处是编写简单，但是无法做到延迟创建对象。但是我们很多时候都希望对象可以尽可能地延迟加载，从而减小负载
 * <p>
 * <p>
 * 线程安全
 * 存在问题：不能延迟加载
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}
