package com.leetcode.problem114.flattenbinarytreetolinkedlist;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, flatten it to a linked list in-place.
 * 
 * For example,
 * Given
 * 
 *          1
 *         / \
 *        2   5
 *       / \   \
 *      3   4   6
 * The flattened tree should look like:
 *    1
 *     \
 *      2
 *       \
 *        3
 *         \
 *          4
 *           \
 *            5
 *             \
 *              6
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public void flatten(TreeNode root) {
        if (null == root) {
            return;
        }

        flatten(root.left);
        flatten(root.right);

        TreeNode tempNode = root;
        if (null != root.left) {
            tempNode = root.left;
            while (null != tempNode.right) {
                tempNode = tempNode.right;
            }
            tempNode.right = root.right;
            root.right = root.left;
            root.left = null;
        }
    }
}