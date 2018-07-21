package com.zhuxl.java.designpattern.$16iterator;

public interface Collection<T> {

    Iterator<T> iterator();

    int size();

    T get(int i);
}
