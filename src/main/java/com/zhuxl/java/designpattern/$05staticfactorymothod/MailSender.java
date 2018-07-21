package com.zhuxl.java.designpattern.$05staticfactorymothod;

public class MailSender implements Sender {


    @Override
    public void send() {
        System.out.println("发送邮件");
    }
}
