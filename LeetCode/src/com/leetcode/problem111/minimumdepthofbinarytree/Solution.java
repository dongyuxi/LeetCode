package com.leetcode.problem111.minimumdepthofbinarytree;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, find its maximum depth.
 * 
 * The maximum depth is the number of nodes along the longest path from the root
 * node down to the farthest leaf node.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }

        if (null == root.left && null == root.right) {
            return 1;
        }
        if (null == root.left) {
            return minDepth(root.right) + 1;
        }
        if (null == root.right) {
            return minDepth(root.left) + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}