package com.zhuxl.java.designpattern.$16iterator;

/**
 * 本例输出:
 * first=A | prev=null | next=A | last=E
 * first=A | prev=A    | next=B | last=E
 * first=A | prev=B    | next=C | last=E
 * first=A | prev=C    | next=D | last=E
 * first=A | prev=D    | next=E | last=E
 */
public class TestCase {
    public static void main(String[] args) {
        MyCollection collection = new MyCollection();

        Iterator iterator = collection.iterator();
        while (iterator.hashNext()) {
            System.out.println("first=" + iterator.first() + " | prev=" + iterator.prev() + " | next=" + iterator.next() + " | last=" + iterator.last());
        }

    }
}
