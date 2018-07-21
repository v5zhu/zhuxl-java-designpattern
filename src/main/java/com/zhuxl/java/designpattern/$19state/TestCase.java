package com.zhuxl.java.designpattern.$19state;

/**
 * 本例输出:
 * 在线状态
 * 离线状态
 */
public class TestCase {
    public static void main(String[] args) {
        State state = new State();
        QQ qq = new QQ(state);

        state.setState(State.ON_LINE);
        qq.sign();

        state.setState(State.OFF_LINE);
        qq.sign();


    }
}
