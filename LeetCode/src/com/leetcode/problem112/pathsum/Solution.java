package com.leetcode.problem112.pathsum;

import com.leetcode.problem.utils.TreeNode;

/**
 *  Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 *  For example:
 *  Given the below binary tree and sum = 22,
 *  
 *            5
 *           / \
 *          4   8
 *         /   / \
 *        11  13  4
 *       /  \      \
 *      7    2      1
 *  return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    private boolean success = false;

    public boolean hasPathSum(TreeNode root, int sum) {
        if (success) {
            return true;
        }
        if (null == root) {
            return false;
        }

        if (null == root.left && null == root.right) {
            return root.val == sum;
        }

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}