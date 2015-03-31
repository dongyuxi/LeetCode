package com.leetcode.problem100.sametree;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given two binary trees, write a function to check if they are equal or not.
 * 
 * Two binary trees are considered equal if they are structurally identical and
 * the nodes have the same value.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (null == p && null == q) {
            return true;
        }
        if (null == p || null == q) {
            return false;
        }

        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }

        return false;
    }
}