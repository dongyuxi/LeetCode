package com.leetcode.problem124.binarytreemaximumpathsum;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, find the maximum path sum.
 * 
 * The path may start and end at any node in the tree.
 * 
 * For example: Given the below binary tree,
 * 
 *   1
 *  / \
 * 2   3
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (null == root) {
            return 0;
        }

        maxPath(root);
        return this.max;
    }

    private int maxPath(TreeNode root) {
        if (null == root) {
            return 0;
        }

        int value = root.val;
        int leftMaxValue = maxPath(root.left);
        if (leftMaxValue > 0) {
            value += leftMaxValue;
        }

        int rightMaxValue = maxPath(root.right);
        if (rightMaxValue > 0) {
            value += rightMaxValue;
        }

        this.max = Math.max(this.max, value);

        return root.val + Math.max(Math.max(leftMaxValue, rightMaxValue), 0);
    }
}
