package com.zhuxl.java.designpattern.$02proxy;

public class JavaCoder implements Coder {
    private String coderName;

    public JavaCoder(String coderName) {
        this.coderName = coderName;
    }


    @Override
    public void implementRequirement(String requireName) {
        System.out.println("JAVA Coder：" + this.coderName + " implements requirement :" + requireName);
    }

    @Override
    public void sleep() {
        System.out.println("JAVA Coder：" + this.coderName + " 准备睡觉休息");
    }
}
