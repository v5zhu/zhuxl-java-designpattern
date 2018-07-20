package com.zhuxl.java.designpattern.$02proxy.dynamicproxy;

import com.zhuxl.java.designpattern.$02proxy.Coder;
import com.zhuxl.java.designpattern.$02proxy.JavaCoder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Customer {

    public static void makeRequest(Coder coder, String... requirements) {

        InvocationHandler handler = new DynamicCoderProxy(coder);

        ClassLoader loader = coder.getClass().getClassLoader();

        Coder proxy = (Coder) Proxy.newProxyInstance(loader, coder.getClass().getInterfaces(), handler);

        for (String req : requirements) {
            proxy.implementRequirement(req);
        }
        proxy.sleep();
    }

}
