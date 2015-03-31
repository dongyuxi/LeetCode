package com.leetcode.problem098.validatebinarysearchtree;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * 
 * Assume a BST is defined as follows:
 * 
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * 
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, (long)Integer.MIN_VALUE - 1, (long)Integer.MAX_VALUE + 1);
    }

    private boolean isValidBST(TreeNode root, long left, long right) {
        if (null == root) {
            return true;
        }

        return root.val > left
                && root.val < right
                && isValidBST(root.left, left, root.val)
                && isValidBST(root.right, root.val, right);
    }

    public static void main(String[] args) {
        long test = (long)Integer.MIN_VALUE - 1;
        System.out.println(test);
    }
}