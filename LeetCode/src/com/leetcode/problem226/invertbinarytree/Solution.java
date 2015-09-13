package com.leetcode.problem226.invertbinarytree;

import com.leetcode.problem.utils.TreeNode;

/**
 * Invert a binary tree.
 * 
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * to
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }

        TreeNode leftNode = invertTree(root.left);
        TreeNode rightNode = invertTree(root.right);
        TreeNode tempNode = leftNode;
        root.left = rightNode;
        root.right = tempNode;

        return root;
    }
}
