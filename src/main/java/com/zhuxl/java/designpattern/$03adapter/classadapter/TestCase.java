package com.zhuxl.java.designpattern.$03adapter.classadapter;

public class TestCase {
    public static void main(String[] args) {

        IphoneAdapter iphoneAdapter =new IphoneAdapter();

        iphoneAdapter.chargeWithIphoneLine();
    }
}
