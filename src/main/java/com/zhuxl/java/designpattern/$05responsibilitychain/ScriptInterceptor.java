package com.zhuxl.java.designpattern.$05responsibilitychain;

public class ScriptInterceptor extends AbstractInterceptor {


    public ScriptInterceptor(String name) {
        super(name);
    }

    @Override
    public void interceptor(RequestContent requestContent) {
        System.out.println(this.getName() + "拦截器开始拦截->" + requestContent.getData());
        if (requestContent.getData() == null || !requestContent.getData().contains("<")) {
            // 不允许请求字符含有<,此处只拦截<
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
