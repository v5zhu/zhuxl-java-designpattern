package com.zhuxl.java.designpattern.$16iterator;

public class MyCollection implements Collection<String> {
    private String string[] = {"A", "B", "C", "D", "E"};


    @Override
    public Iterator<String> iterator() {
        return new MyIterator<String>(this);
    }

    @Override
    public int size() {
        return string.length;
    }

    @Override
    public String get(int i) {
        return string[i];
    }
}
