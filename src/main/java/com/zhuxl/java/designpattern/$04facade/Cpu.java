package com.zhuxl.java.designpattern.$04facade;

public class Cpu implements SwitchInterface{
    @Override
    public void start() {
        System.out.println("CPU 启动");
    }

    @Override
    public void working() {
        System.out.println("CPU 正在工作...");
    }

    @Override
    public void shutdown() {
        System.out.println("CPU 已关闭");
    }
}
