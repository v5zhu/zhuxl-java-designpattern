package com.zhuxl.java.designpattern.$03adapter.objectadapter;


import com.zhuxl.java.designpattern.$03adapter.AndroidLine;

public class TestCase {
    public static void main(String[] args) {

        AndroidLine androidLine = new AndroidLine();

        IphoneAdapter iphoneAdapter = new IphoneAdapter(androidLine);

        iphoneAdapter.chargeWithIphoneLine();
    }
}
