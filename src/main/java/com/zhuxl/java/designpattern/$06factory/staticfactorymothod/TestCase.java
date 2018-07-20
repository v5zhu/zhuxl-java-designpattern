package com.zhuxl.java.designpattern.$06factory.staticfactorymothod;

import com.zhuxl.java.designpattern.$06factory.Sender;

public class TestCase {
    public static void main(String[] args) {
        Sender mailSender = SenderFactory.produceMailSender();
        Sender smsSender = SenderFactory.produceSmsSender();

        mailSender.send();
        smsSender.send();
    }
}
