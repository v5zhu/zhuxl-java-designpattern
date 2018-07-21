package com.zhuxl.java.designpattern.$11composite;

public class TestCase {
    static TreeNode root = null;


    public static void main(String[] args) {
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        root=nodeA;
        nodeA.add(nodeB);
        nodeB.add(nodeC);
        System.out.println(root.getChildren());
    }
}
