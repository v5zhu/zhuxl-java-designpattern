package com.zhuxl.java.designpattern.$02proxy.dynamicproxy;

import com.zhuxl.java.designpattern.$02proxy.Coder;
import com.zhuxl.java.designpattern.$02proxy.JavaCoder;

public class TestCase {
    public static void main(String[] args) {
        Coder javaCoder = new JavaCoder("张三");
        Customer.makeRequest(javaCoder, "用户注册", "用户登录", "修改资料");
    }
}
