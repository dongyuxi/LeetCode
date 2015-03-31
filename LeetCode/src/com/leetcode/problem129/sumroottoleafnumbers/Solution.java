package com.leetcode.problem129.sumroottoleafnumbers;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path
 * could represent a number.
 * 
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * 
 * Find the total sum of all root-to-leaf numbers.
 * 
 * For example,
 *     1
 *    / \
 *   2   3
 * 
 * The root-to-leaf path 1->2 represents the number 12. The root-to-leaf path
 * 1->3 represents the number 13.
 * 
 * Return the sum = 12 + 13 = 25.
 * 
 * @author dongyuxi
 * 
 */
public class Solution {
    public int sumNumbers(TreeNode root) {
        if (null == root) {
            return 0;
        }

        return sumNumbers(root, 0);
    }

    private int sumNumbers(TreeNode root, int val) {
        if (null == root) {
            return -1;
        }

        if (null == root.left && null == root.right) {
            return val * 10 + root.val;
        }

        int sum = 0;
        if (null != root.left) {
            sum += sumNumbers(root.left, val * 10 + root.val);
        }
        if (null != root.right) {
            sum += sumNumbers(root.right, val * 10 + root.val);
        }

        return sum;
    }
}