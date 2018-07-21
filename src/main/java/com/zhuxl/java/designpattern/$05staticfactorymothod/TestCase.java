package com.zhuxl.java.designpattern.$05staticfactorymothod;


public class TestCase {
    public static void main(String[] args) {
        Sender mailSender = SenderFactory.produceMailSender();
        Sender smsSender = SenderFactory.produceSmsSender();

        mailSender.send();
        smsSender.send();
    }
}
