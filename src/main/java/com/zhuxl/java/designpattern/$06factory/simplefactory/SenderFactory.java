package com.zhuxl.java.designpattern.$06factory.simplefactory;

import com.zhuxl.java.designpattern.$06factory.MailSender;
import com.zhuxl.java.designpattern.$06factory.Sender;
import com.zhuxl.java.designpattern.$06factory.SmsSender;

/**
 * 在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象
 */
public class SenderFactory {
    public static final int MAIL = 1;
    public static final int SMS = 2;

    public static Sender produce(int type) {
        switch (type) {
            case SenderFactory.MAIL:
                return new MailSender();
            case SenderFactory.SMS:
                return new SmsSender();
            default:
                throw new RuntimeException("没有这种发送器");
        }
    }
}
