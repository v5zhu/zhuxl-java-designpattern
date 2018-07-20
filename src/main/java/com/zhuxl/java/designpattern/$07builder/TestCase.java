package com.zhuxl.java.designpattern.$07builder;

public class TestCase {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.buildMailSender(10);
        builder.buildSmsSender(10);

        for (Sender s : builder.senders) {
            s.send();
        }
    }
}
