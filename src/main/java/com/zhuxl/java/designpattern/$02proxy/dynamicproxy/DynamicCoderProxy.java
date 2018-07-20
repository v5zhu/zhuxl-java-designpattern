package com.zhuxl.java.designpattern.$02proxy.dynamicproxy;

import com.zhuxl.java.designpattern.$02proxy.Coder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicCoderProxy implements InvocationHandler {
    private Coder coder;

    public DynamicCoderProxy(Coder coder) {
        this.coder = coder;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始时间:" + System.currentTimeMillis());
        Object result = method.invoke(coder, args);
        System.out.println("完成时间:" + System.currentTimeMillis());
        return result;
    }
}
