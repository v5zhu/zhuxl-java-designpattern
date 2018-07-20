package com.zhuxl.java.designpattern.$04facade;

public class Disk implements SwitchInterface{
    @Override
    public void start() {
        System.out.println("Disk 启动");
    }

    @Override
    public void working() {
        System.out.println("Disk 正在工作...");
    }

    @Override
    public void shutdown() {
        System.out.println("Disk 已关闭");
    }
}
