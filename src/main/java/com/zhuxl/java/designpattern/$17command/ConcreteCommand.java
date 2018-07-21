package com.zhuxl.java.designpattern.$17command;

public class ConcreteCommand implements Command {

    private Soldier soldier;

    public ConcreteCommand(Soldier soldier) {
        this.soldier = soldier;
    }


    @Override
    public void exec() {
        this.soldier.doCommand();
    }
}
