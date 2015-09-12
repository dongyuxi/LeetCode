package com.leetcode.problem110.balancedbinarytree;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, determine if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more
 * than 1.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    private boolean balanced = true;

    public boolean isBalanced(TreeNode root) {
        if (null == root) {
            return true;
        }

        int depth = checkBalancedUsingHeight(root);

        return (depth != -1) ? true : false;
    }

    private int checkBalancedUsingHeight(TreeNode root) {
        if (!balanced) {
            return -1;
        }

        if (null == root) {
            return 0;
        }

        int leftDepth = checkBalancedUsingHeight(root.left);
        int rightDepth = checkBalancedUsingHeight(root.right);
        if (leftDepth == -1 || rightDepth == -1 || Math.abs(leftDepth - rightDepth) > 1) {
            balanced = false;
            return -1;
        }
        return Math.max(leftDepth, rightDepth) + 1;
    }
}