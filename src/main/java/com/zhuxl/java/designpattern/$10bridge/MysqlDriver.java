package com.zhuxl.java.designpattern.$10bridge;

public class MysqlDriver implements Driver {
    @Override
    public void connection() {
        System.out.println("Mysql 驱动连接数据库");
    }
}
