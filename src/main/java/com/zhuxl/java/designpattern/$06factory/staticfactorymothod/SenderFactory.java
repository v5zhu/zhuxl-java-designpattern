package com.zhuxl.java.designpattern.$06factory.staticfactorymothod;

import com.zhuxl.java.designpattern.$06factory.MailSender;
import com.zhuxl.java.designpattern.$06factory.Sender;
import com.zhuxl.java.designpattern.$06factory.SmsSender;

/**
 * 在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象
 */
public class SenderFactory {


    public static Sender produceMailSender() {
        return new MailSender();
    }

    public static Sender produceSmsSender() {
        return new SmsSender();
    }

}
