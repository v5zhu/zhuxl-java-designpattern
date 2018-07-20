package com.zhuxl.java.designpattern.$06factory.abstractfactory;

import com.zhuxl.java.designpattern.$06factory.Sender;

public class TestCase {
    public static void main(String[] args) {
        Provider mailProvider = new MailSenderFactory();
        Sender mailSender = mailProvider.produceSender();

        Provider smsProvider = new SmsSenderFactory();
        Sender smsSender = smsProvider.produceSender();

        mailSender.send();
        smsSender.send();
    }
}
