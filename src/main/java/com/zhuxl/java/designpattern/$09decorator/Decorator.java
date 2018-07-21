package com.zhuxl.java.designpattern.$09decorator;

/**
 * 装饰器模式的应用场景：
 * <p>
 * 1、需要扩展一个类的功能。
 * <p>
 * 2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 * <p>
 * 缺点：产生过多相似的对象，不易排错！
 */
public class Decorator implements Cooker {
    private Pan pan;

    public Decorator(Pan pan) {
        this.pan = pan;
    }


    @Override
    public void cookDish() {
        this.before();
        pan.cookDish();
        this.after();
    }

    @Override
    public void cookSoup() {
        this.before();
        pan.cookSoup();
        this.after();
    }

    private void before() {
        System.out.println("加水");
    }

    private void after() {
        System.out.println("加盐");
    }
}
