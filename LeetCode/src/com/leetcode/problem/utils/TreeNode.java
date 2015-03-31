package com.leetcode.problem.utils;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public void inorder() {
        if (null != this.left) {
            this.left.inorder();
        }
        System.out.println(this.val);
        if (null != this.right) {
            this.right.inorder();
        }
    }

    public void preorder() {
        System.out.println(this.val);
        if (null != this.left) {
            this.left.inorder();
        }
        if (null != this.right) {
            this.right.inorder();
        }
    }

    public void postorder() {
        if (null != this.left) {
            this.left.inorder();
        }
        if (null != this.right) {
            this.right.inorder();
        }
        System.out.println(this.val);
    }
}
