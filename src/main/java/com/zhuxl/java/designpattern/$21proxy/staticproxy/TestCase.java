package com.zhuxl.java.designpattern.$21proxy.staticproxy;

import com.zhuxl.java.designpattern.$21proxy.Coder;
import com.zhuxl.java.designpattern.$21proxy.JavaCoder;

public class TestCase {
    public static void main(String[] args) {
        Coder coder = new JavaCoder("张三");

        Customer.makeRequest(coder, "实现用户注册", "实现用户登录");
    }
}
