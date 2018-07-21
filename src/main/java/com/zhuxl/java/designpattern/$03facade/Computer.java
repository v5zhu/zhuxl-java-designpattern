package com.zhuxl.java.designpattern.$03facade;

public class Computer implements SwitchInterface {
    private Cpu cpu;

    private Disk disk;

    private Memory memory;

    public Computer() {
        this.cpu = new Cpu();
        this.disk = new Disk();
        this.memory = new Memory();
    }


    @Override
    public void start() {
        System.out.println("计算机开始启动");
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("计算机完成启动");
    }

    @Override
    public void working() {
        System.out.println("计算机正在工作....");
        cpu.working();
        disk.working();
        memory.working();
    }

    @Override
    public void shutdown() {
        System.out.println("计算机开始关机");
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
        System.out.println("计算机完成关机");
    }
}
