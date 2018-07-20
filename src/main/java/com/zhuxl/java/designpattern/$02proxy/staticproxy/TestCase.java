package com.zhuxl.java.designpattern.$02proxy.staticproxy;

import com.zhuxl.java.designpattern.$02proxy.Coder;
import com.zhuxl.java.designpattern.$02proxy.JavaCoder;

public class TestCase {
    public static void main(String[] args) {
        Coder coder = new JavaCoder("张三");

        Customer.makeRequest(coder, "实现用户注册", "实现用户登录");
    }
}
