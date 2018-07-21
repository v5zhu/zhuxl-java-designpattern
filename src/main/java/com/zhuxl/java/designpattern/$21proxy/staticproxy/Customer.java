package com.zhuxl.java.designpattern.$21proxy.staticproxy;

import com.zhuxl.java.designpattern.$21proxy.Coder;

public class Customer {
    public static void makeRequest(Coder coder, String... requirements) {
        StaticCoderProxy proxy = new StaticCoderProxy(coder);
        for (String req : requirements) {
            proxy.implementRequirement(req);
        }
    }
}
