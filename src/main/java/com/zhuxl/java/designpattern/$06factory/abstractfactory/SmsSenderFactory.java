package com.zhuxl.java.designpattern.$06factory.abstractfactory;

import com.zhuxl.java.designpattern.$06factory.Sender;
import com.zhuxl.java.designpattern.$06factory.SmsSender;

public class SmsSenderFactory implements Provider {


    @Override
    public Sender produceSender() {
        return new SmsSender();
    }

}
