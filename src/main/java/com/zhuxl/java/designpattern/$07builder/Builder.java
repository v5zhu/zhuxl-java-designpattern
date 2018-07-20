package com.zhuxl.java.designpattern.$07builder;

import java.util.ArrayList;
import java.util.List;

public class Builder {

    public List<Sender> senders = new ArrayList<Sender>();


    public void buildMailSender(int count) {
        for (int i = 0; i < count; i++) {
            senders.add(new MailSender());
        }
    }

    public void buildSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            senders.add(new SmsSender());
        }
    }
}
