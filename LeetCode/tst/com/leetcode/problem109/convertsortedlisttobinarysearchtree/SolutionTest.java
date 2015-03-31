package com.leetcode.problem109.convertsortedlisttobinarysearchtree;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.ListNode;
import com.leetcode.problem.utils.TreeNode;

/**
 * Given an array where elements are sorted in ascending order, convert it to a
 * height balanced BST.
 * 
 * @author dongyuxi
 *
 */
public class SolutionTest {
    public Solution solution = null;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void test() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        TreeNode root = solution.sortedListToBST(head);
        root.inorder();
    }
}