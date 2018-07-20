package com.zhuxl.java.designpattern.$06factory.simplefactory;

import com.zhuxl.java.designpattern.$06factory.Sender;

public class TestCase {
    public static void main(String[] args) {
        Sender mailSender = SenderFactory.produce(SenderFactory.MAIL);
        Sender smsSender = SenderFactory.produce(SenderFactory.SMS);

        mailSender.send();
        smsSender.send();
    }
}
