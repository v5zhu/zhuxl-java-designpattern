package com.zhuxl.java.designpattern.$08prototype;

import java.io.IOException;

public class TestCase {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Prototype prototype = new Prototype();
        Property property = new Property("property v1");
        prototype.setProperty(property);
        System.out.println("拷贝前:" + prototype.getProperty().name);

        System.out.println("------------------------------------------------------");
        Prototype clone = (Prototype) prototype.clone();
        clone.setProperty(property);
        System.out.println("浅拷贝prototype:" + prototype.getProperty().name);
        System.out.println("浅拷贝clone:" + clone.getProperty().name);

        System.out.println("------------------------------------------------------");
        Prototype deepClone = (Prototype) prototype.deepClone();
        System.out.println("深拷贝prototype:" + prototype.getProperty().name);
        System.out.println("深拷贝deepClone:" + deepClone.getProperty().name);

        System.out.println("=================================修改引用对象为v2后===============================================");
        property.name = "property v2";

        System.out.println("浅拷贝prototype:" + prototype.getProperty().name);
        System.out.println("浅拷贝clone:" + clone.getProperty().name);

        System.out.println("------------------------------------------------------");
        System.out.println("深拷贝prototype:" + prototype.getProperty().name);
        System.out.println("深拷贝deepClone:" + deepClone.getProperty().name);

    }
}
