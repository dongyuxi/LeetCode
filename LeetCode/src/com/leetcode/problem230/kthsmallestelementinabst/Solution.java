package com.leetcode.problem230.kthsmallestelementinabst;

import java.util.Stack;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary search tree, write a function kthSmallest to find the kth
 * smallest element in it.
 * 
 * Note: You may assume k is always valid, 1 ¡Ü k ¡Ü BST's total elements.
 * 
 * Follow up: What if the BST is modified (insert/delete operations) often and
 * you need to find the kth smallest frequently? How would you optimize the
 * kthSmallest routine?
 * 
 * Hint:
 * 
 * 1. Try to utilize the property of a BST.
 * 2. What if you could modify the BST node's structure?
 * 3. The optimal runtime complexity is O(height of BST).
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode tmpNode = root;
        stack.push(tmpNode);
        do {
            while (null != tmpNode) {
                stack.push(tmpNode);
                tmpNode = tmpNode.left;
            }
            TreeNode top = stack.pop();
            k--;
            if (k == 0) {
                return top.val;
            }
            tmpNode = top.right;
        } while (!stack.isEmpty());

        return 0;
    }

}
