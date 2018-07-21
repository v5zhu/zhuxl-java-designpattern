package com.zhuxl.java.designpattern.$04responsibilitychain;

public class AuthInterceptor extends AbstractInterceptor {


    public AuthInterceptor(String name) {
        super(name);
    }

    @Override
    public void interceptor(RequestContent requestContent) {
        System.out.println(this.getName() + "拦截器开始拦截->"+requestContent.getSign());
        if ("sign8888".equals(requestContent.getSign())) {
            // 只允许签名为sign8888访问
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
