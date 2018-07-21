package com.zhuxl.java.designpattern.$09decorator;

public class Pan implements Cooker {
    @Override
    public void cookDish() {
        System.out.println("烧菜");
    }

    @Override
    public void cookSoup() {
        System.out.println("煲汤");
    }
}
