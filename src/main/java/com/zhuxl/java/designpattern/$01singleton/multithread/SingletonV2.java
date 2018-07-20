package com.zhuxl.java.designpattern.$01singleton.multithread;

/**
 * 满足延迟加载
 * 这种写法被称为“双重检查锁”，顾名思义，就是在getSingleton()方法中，进行两次null检查。看似多此一举，但实际上却极大提升了并发度，进而提升了性能。为什么可以提高并发度呢？就像上文说的，在单例中new
 * 的情况非常少，绝大多数都是可以并行的读操作。因此在加锁前多进行一次null检查就可以减少绝大多数的加锁操作，执行效率提高的目的也就达到了
 * <p>
 * <p>
 * 线程安全
 * 存在问题：
 */
public class SingletonV2 {
    private static volatile SingletonV2 instance = null;

    private SingletonV2() {

    }

    public static SingletonV2 getInstance() {
        if (instance == null) {
            synchronized (SingletonV2.class) {
                if (instance == null) {
                    instance = new SingletonV2();
                }
            }
        }
        return instance;
    }
}
