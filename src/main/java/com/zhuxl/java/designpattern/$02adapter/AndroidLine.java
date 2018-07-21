package com.zhuxl.java.designpattern.$02adapter;

/**
 * 创建一根android线，用来实现android充电功能
 */
public class AndroidLine implements AndroidInterface {

    @Override
    public void chargeWithAndroidLine() {
        System.out.println("使用Android线充电");
    }
}
