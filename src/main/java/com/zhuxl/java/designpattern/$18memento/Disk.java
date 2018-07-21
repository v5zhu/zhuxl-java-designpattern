package com.zhuxl.java.designpattern.$18memento;

public class Disk {
    private Memento memento;

    public Disk(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

