package com.zhuxl.java.designpattern.$17command;

public class Leader {
    private Command command;

    public Leader(Command command) {
        this.command = command;
    }

    public void issue() {
        System.out.println("长官发出命令");
        command.exec();
    }
}
