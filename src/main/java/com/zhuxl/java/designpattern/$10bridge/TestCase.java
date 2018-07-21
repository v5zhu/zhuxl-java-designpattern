package com.zhuxl.java.designpattern.$10bridge;

public class TestCase {
    public static void main(String[] args) {
        DriverManagerBridge bridge = new DriverManagerBridge();
        bridge.setDriver(new MysqlDriver());
        bridge.connection();

        bridge.setDriver(new OracleDriver());
        bridge.connection();
    }
}
