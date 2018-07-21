package com.zhuxl.java.designpattern.$19state;

public class QQ {
    private State state;

    public QQ(State state) {
        this.state = state;
    }

    public void sign() {
        if (State.ON_LINE == state.getState()) {
            this.state.online();
        } else if (State.OFF_LINE == state.getState()) {
            this.state.offline();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
