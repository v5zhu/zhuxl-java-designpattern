package com.zhuxl.java.designpattern.$21proxy.dynamicproxy;

import com.zhuxl.java.designpattern.$21proxy.Coder;
import com.zhuxl.java.designpattern.$21proxy.JavaCoder;

public class TestCase {
    public static void main(String[] args) {
        Coder javaCoder = new JavaCoder("张三");
        Customer.makeRequest(javaCoder, "用户注册", "用户登录", "修改资料");
    }
}
