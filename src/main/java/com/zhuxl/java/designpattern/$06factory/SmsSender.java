package com.zhuxl.java.designpattern.$06factory;

import com.zhuxl.java.designpattern.$06factory.Sender;

public class SmsSender implements Sender {


    @Override
    public void send() {
        System.out.println("发送短信");
    }
}
