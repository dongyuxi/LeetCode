package com.leetcode.problem108.convertsortedarraytobinarysearchtree;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given an array where elements are sorted in ascending order, convert it to a
 * height balanced BST.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        if (null == num || 0 == num.length) {
            return null;
        }

        return sortedArrayToBST(num, 0, num.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] num, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(num[mid]);
        TreeNode left = sortedArrayToBST(num, start, mid - 1);
        TreeNode right = sortedArrayToBST(num, mid + 1, end);
        root.left = left;
        root.right = right;

        return root;
    }
}