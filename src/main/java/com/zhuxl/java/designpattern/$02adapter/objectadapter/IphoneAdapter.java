package com.zhuxl.java.designpattern.$02adapter.objectadapter;

import com.zhuxl.java.designpattern.$02adapter.AndroidLine;
import com.zhuxl.java.designpattern.$02adapter.IphoneInterface;

/**
 * 创建一个转接头,在创建转接头的时候附带一根android线
 */
public class IphoneAdapter implements IphoneInterface {

    private AndroidLine androidLine;

    public IphoneAdapter(AndroidLine androidLine) {
        this.androidLine = androidLine;
    }


    @Override
    public void chargeWithIphoneLine() {
        androidLine.chargeWithAndroidLine();
    }
}
