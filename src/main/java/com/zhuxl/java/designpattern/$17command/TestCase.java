package com.zhuxl.java.designpattern.$17command;

public class TestCase {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();

        ConcreteCommand command = new ConcreteCommand(soldier);

        Leader leader = new Leader(command);

        leader.issue();
    }

}
