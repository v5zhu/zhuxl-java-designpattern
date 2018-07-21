package com.zhuxl.java.designpattern.$18memento;

/**
 * 本例输出：
 * 修改前:年终总结v1
 * 修改后:年终总结v2
 * 恢复后:年终总结v1
 */
public class TestCase {

    public static void main(String[] args) {
        Word word = new Word("年终总结v1");

        Disk disk = new Disk(word.createBackup());

        System.out.println("修改前:" + word.getContent());
        word.setContent("年终总结v2");
        System.out.println("修改后:" + word.getContent());

        word.recoveryContent(disk.getMemento());

        System.out.println("恢复后:" + word.getContent());
    }

}
