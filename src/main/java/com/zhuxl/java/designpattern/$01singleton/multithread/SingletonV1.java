package com.zhuxl.java.designpattern.$01singleton.multithread;

/**
 * 满足延迟加载
 * 这种写法考虑了线程安全，将对singleton的null判断以及new的部分使用synchronized进行加锁。同时，对singleton对象使用volatile
 * 关键字进行限制，保证其对所有线程的可见性，并且禁止对其进行指令重排序优化。如此即可从语义上保证这种单例模式写法是线程安全的。注意，这里说的是语义上，实际使用中还是存在小坑的
 * <p>
 * <p>
 * 线程安全
 * 存在问题：（1）性能低，所有线程需排队（2）
 */
public class SingletonV1 {
    private static volatile SingletonV1 instance = null;

    private SingletonV1() {

    }

    public static SingletonV1 getInstance() {
        synchronized (SingletonV1.class) {
            if (instance == null) {
                instance = new SingletonV1();
            }
        }
        return instance;
    }
}
