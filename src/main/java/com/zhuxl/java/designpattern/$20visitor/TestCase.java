package com.zhuxl.java.designpattern.$20visitor;

/**
 * 本例输出:
 * visit the subject：love
 * visit the subject：love
 */
public class TestCase {

    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();

        Subject subject = new MySubject();

        visitor.visit(subject);
        subject.accept(visitor);
    }
}
