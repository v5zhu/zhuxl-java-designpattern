package com.zhuxl.java.designpattern.$04responsibilitychain;

public class RequestContent {
    private String ip;

    private String sign;

    private String data;

    public RequestContent(String ip, String sign, String data) {
        this.ip = ip;
        this.sign = sign;
        this.data = data;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
