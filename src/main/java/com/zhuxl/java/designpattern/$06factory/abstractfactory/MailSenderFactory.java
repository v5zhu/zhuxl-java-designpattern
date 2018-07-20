package com.zhuxl.java.designpattern.$06factory.abstractfactory;

import com.zhuxl.java.designpattern.$06factory.MailSender;
import com.zhuxl.java.designpattern.$06factory.Sender;

public class MailSenderFactory implements Provider {


    @Override
    public Sender produceSender() {
        return new MailSender();
    }

}
