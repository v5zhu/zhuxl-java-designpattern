package com.zhuxl.java.designpattern.$15observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 类似于邮件订阅和RSS订阅，当我们浏览一些博客或wiki时，经常会看到RSS
 * 图标，就这的意思是，当你订阅了该文章，如果后续有更新，会及时通知你。其实，
 * 简单来讲就一句话：当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！对象之间是一种一对多的关系
 * <p>
 * MySubject类就是我们的主对象，Observer1和Observer2是依赖于MySubject的对象，当MySubject变化时，Observer1和Observer2必然变化。
 * AbstractSubject类中定义着需要监控的对象列表，可以对其进行修改：增加或删除被监控对象，且当MySubject变化时，负责通知在列表内存在的对象
 */
public abstract class AbstractSubject implements Subject {
    private Vector<Observer> container = new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        container.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        container.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        Enumeration<Observer> others = container.elements();
        while (others.hasMoreElements()) {
            others.nextElement().update();
        }
    }
}
