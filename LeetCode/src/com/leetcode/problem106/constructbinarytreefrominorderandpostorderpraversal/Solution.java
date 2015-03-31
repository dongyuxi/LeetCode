package com.leetcode.problem106.constructbinarytreefrominorderandpostorderpraversal;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * 
 * Note: You may assume that duplicates do not exist in the tree.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (null == inorder || null == postorder) {
            return null;
        }

        return buildTree(inorder, 0, inorder.length - 1, postorder, 0,
                postorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int iStart, int iEnd,
            int[] postorder, int pStart, int pEnd) {
        if (iStart > iEnd) {
            return null;
        }
        int rootVal = postorder[pEnd];
        TreeNode rootNode = new TreeNode(rootVal);
        int rootIndex = 0;
        while (rootIndex < iEnd - iStart + 1) {
            if (inorder[iStart + rootIndex] == rootVal) {
                break;
            }
            rootIndex++;
        }
        TreeNode leftNode = buildTree(inorder, iStart, iStart + rootIndex - 1, postorder, pStart, pStart + rootIndex - 1);
        TreeNode rightNode = buildTree(inorder, iStart + rootIndex + 1, iEnd, postorder, pStart + rootIndex, pEnd - 1);
        rootNode.left = leftNode;
        rootNode.right = rightNode;

        return rootNode;
    }
}