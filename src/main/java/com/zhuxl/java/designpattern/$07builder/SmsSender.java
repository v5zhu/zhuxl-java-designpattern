package com.zhuxl.java.designpattern.$07builder;


public class SmsSender implements Sender {


    @Override
    public void send() {
        System.out.println("发送短信");
    }
}
