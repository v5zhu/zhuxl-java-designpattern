package com.zhuxl.java.designpattern.$02proxy.staticproxy;

import com.zhuxl.java.designpattern.$02proxy.Coder;

public class StaticCoderProxy implements Coder {
    private Coder coder;

    public StaticCoderProxy(Coder coder) {
        this.coder = coder;
    }

    @Override
    public void implementRequirement(String requireName) {
        System.out.println("开始时间:" + System.currentTimeMillis());
        coder.implementRequirement(requireName);
        System.out.println("完成时间:" + System.currentTimeMillis());
    }

    @Override
    public void sleep() {
        System.out.println("开始时间:" + System.currentTimeMillis());
        coder.sleep();
        System.out.println("完成时间:" + System.currentTimeMillis());
    }
}
