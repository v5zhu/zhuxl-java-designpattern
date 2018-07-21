package com.zhuxl.java.designpattern.$02adapter.classadapter;

import com.zhuxl.java.designpattern.$02adapter.AndroidLine;
import com.zhuxl.java.designpattern.$02adapter.IphoneInterface;

/**
 * 创建一个苹果和android的转接头（适配器）,让苹果接口可以用android线来对接
 */
public class IphoneAdapter extends AndroidLine implements IphoneInterface {

    @Override
    public void chargeWithIphoneLine() {
        System.out.print("使用转接头Iphone转Android->");
        chargeWithAndroidLine();
    }
}
