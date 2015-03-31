package com.leetcode.problem109.convertsortedlisttobinarysearchtree;

import com.leetcode.problem.utils.ListNode;
import com.leetcode.problem.utils.TreeNode;

/**
 * Given an array where elements are sorted in ascending order, convert it to a
 * height balanced BST.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (null == head) {
            return null;
        }

        int length = 0;
        ListNode tempHead = head;
        while (null != tempHead) {
            length++;
            tempHead = tempHead.next;
        }

        return sortedListToBST(head, length);
    }

    private TreeNode sortedListToBST(ListNode head , int length) {
        if (length <= 0 || null == head) {
            return null;
        }

        ListNode temp = head;
        for (int i = 0; i < length / 2; i++) {
            temp = temp.next;
        }
        TreeNode root = new TreeNode(temp.val);
        TreeNode left = sortedListToBST(head, length / 2);
        TreeNode right = sortedListToBST(temp.next, length - length / 2 - 1);
        root.left = left;
        root.right = right;

        return root;
    }
}