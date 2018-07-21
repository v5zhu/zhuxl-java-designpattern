package com.zhuxl.java.designpattern.$18memento;

public class Word {
    private String content;

    public Word(String content) {
        this.content = content;
    }


    public Memento createBackup() {
        return new Memento(content);
    }

    public void recoveryContent(Memento memento) {
        this.content = memento.getContent();
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
