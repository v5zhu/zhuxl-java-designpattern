package com.zhuxl.java.designpattern.$06factory;

import com.zhuxl.java.designpattern.$06factory.Sender;

public class MailSender implements Sender {


    @Override
    public void send() {
        System.out.println("发送邮件");
    }
}
