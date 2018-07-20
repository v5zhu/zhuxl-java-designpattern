package com.zhuxl.java.designpattern.$05responsibilitychain;

public class TestCase {
    public static void main(String[] args) {
        RequestContent requestContent = new RequestContent("180.180.180.180", "sign8888", "{'token':'xxxx'}");
        AbstractInterceptor ipInterceptor = new IpInterceptor("[Ip拦截器1]");
        AbstractInterceptor authInterceptor = new AuthInterceptor("[权限拦截器]");
        AbstractInterceptor scriptInterceptor = new ScriptInterceptor("[脚本拦截器]");

        ipInterceptor.setNextInterceptor(authInterceptor);
        authInterceptor.setNextInterceptor(scriptInterceptor);

        ipInterceptor.interceptor(requestContent);

    }
}
