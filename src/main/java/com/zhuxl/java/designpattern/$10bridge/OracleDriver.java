package com.zhuxl.java.designpattern.$10bridge;

public class OracleDriver implements Driver {
    @Override
    public void connection() {
        System.out.println("oracle 驱动连接数据库");
    }
}
