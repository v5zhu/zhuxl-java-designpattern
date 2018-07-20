package com.zhuxl.java.designpattern.$01singleton.staticinnerclass;

/**
 * 满足延迟加载
 * 把Singleton实例放到一个静态内部类中，这样就避免了静态实例在Singleton类加载的时候就创建对象，
 * 并且由于静态内部类只会被加载一次，所以这种写法也是线程安全的
 * <p>
 * <p>
 * 线程安全
 */
public class Singleton {

    private Singleton() {

    }

    public static Singleton getInstance() {

        return SingletonHolder.instance;
    }


    private static class SingletonHolder {
        private static Singleton instance = new Singleton();
    }
}
