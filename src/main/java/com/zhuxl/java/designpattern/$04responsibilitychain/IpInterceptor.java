package com.zhuxl.java.designpattern.$04responsibilitychain;

public class IpInterceptor extends AbstractInterceptor {


    public IpInterceptor(String name) {
        super(name);
    }

    @Override
    public void interceptor(RequestContent requestContent) {
        System.out.println(this.getName() + "拦截器开始拦截->"+requestContent.getIp());
        if ("180.180.180.180".equals(requestContent.getIp())) {
            // 只允许该IP访问
            if (this.getNextInterceptor() == null) {
                System.out.println("全部拦截结束");
            } else {
                this.getNextInterceptor().interceptor(requestContent);
            }
        } else {
            System.out.println(this.getName() + "拦截器拦截请求,请求终止");
        }
        System.out.println(this.getName() + "拦截器结束拦截");

    }
}
