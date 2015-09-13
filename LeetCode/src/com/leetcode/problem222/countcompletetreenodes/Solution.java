package com.leetcode.problem222.countcompletetreenodes;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a complete binary tree, count the number of nodes.
 * 
 * Definition of a complete binary tree from Wikipedia: In a complete binary
 * tree every level, except possibly the last, is completely filled, and all
 * nodes in the last level are as far left as possible. It can have between 1
 * and 2h nodes inclusive at the last level h.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public int countNodes(TreeNode root) {
        if (null == root) {
            return 0;
        }

        int leftLevel = 1;
        TreeNode left = root.left;
        while (null != left) {
            leftLevel++;
            left = left.left;
        }

        int rightLevel = 1;
        TreeNode right = root.right;
        while (null != right) {
            rightLevel++;
            right = right.right;
        }

        if (leftLevel == rightLevel) {
            return (2 << (leftLevel - 1)) - 1;
        }

        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}