package com.zhuxl.java.designpattern.$04facade;

public class Memory implements SwitchInterface{
    @Override
    public void start() {
        System.out.println("Memory 启动");
    }

    @Override
    public void working() {
        System.out.println("Memory 正在工作...");
    }

    @Override
    public void shutdown() {
        System.out.println("Memory 已关闭");
    }
}
