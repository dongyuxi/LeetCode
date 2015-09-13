package com.leetcode.problem.utils;

public class TreeLinkNode {
    public int val;
    public TreeLinkNode left;
    public TreeLinkNode right;
    public TreeLinkNode next;

    public TreeLinkNode(int x) {
        val = x;
    }

    public void inorder() {
        if (null != this.left) {
            this.left.inorder();
        }
        if (null != this.next) {
            System.out.println(this.val + "->" + this.next.val);
        } else {
            System.out.println(this.val);
        }
        if (null != this.right) {
            this.right.inorder();
        }
    }

    public void preorder() {
        if (null != this.next) {
            System.out.println(this.val + "->" + this.next.val);
        } else {
            System.out.println(this.val);
        }

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
        if (null != this.next) {
            System.out.println(this.val + "->" + this.next.val);
        } else {
            System.out.println(this.val);
        }
    }
}
