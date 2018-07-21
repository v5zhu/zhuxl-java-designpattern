package com.zhuxl.java.designpattern.$16iterator;

public class MyIterator<T> implements Iterator<T> {
    private Collection<T> collection;
    private int pos = 0;

    public MyIterator(Collection<T> collection) {
        this.collection = collection;
    }

    @Override
    public T first() {
        return collection.get(0);
    }

    @Override
    public boolean hashNext() {
        return pos < collection.size();
    }

    @Override
    public T prev() {
        if ((pos - 1) < 0) {
            return null;
        }
        return collection.get(pos - 1);
    }

    @Override
    public T next() {
        return collection.get(pos++);
    }

    @Override
    public T last() {
        return collection.get(collection.size() - 1);
    }
}
