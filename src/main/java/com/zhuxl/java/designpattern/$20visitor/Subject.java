package com.zhuxl.java.designpattern.$20visitor;

public interface Subject {
    public void accept(Visitor visitor);

    public String getSubject();
}
