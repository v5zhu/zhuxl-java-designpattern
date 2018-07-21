package com.zhuxl.java.designpattern.$22mediator;

/**
 * 本例输出：
 * 中介建立房东与租客的联系
 * 中介收取1500元中介费
 * 女房东给一半中介费750
 * 房客给一半中介费750
 */
public class TestCase {
    public static void main(String[] args) {
        Mediator lianjia = new LianjiaMediator();

        lianjia.createContract();
        lianjia.trade();
    }
}
