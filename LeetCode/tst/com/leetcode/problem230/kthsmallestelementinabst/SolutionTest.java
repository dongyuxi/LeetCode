package com.leetcode.problem230.kthsmallestelementinabst;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

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
public class SolutionTest {
    public Solution solution = null;

    @Before
    public void setup() {
        solution = new Solution();
    }

    /**
    *      4
    *    /   \
    *   2     7
    *  / \   / \
    * 1   3 6   9
    */
    @Test
    public void test() {
        TreeNode node11 = new TreeNode(4);
        TreeNode node21 = new TreeNode(2);
        TreeNode node22 = new TreeNode(7);
        TreeNode node31 = new TreeNode(1);
        TreeNode node32 = new TreeNode(3);
        TreeNode node33 = new TreeNode(6);
        TreeNode node34 = new TreeNode(9);
        node11.left = node21;
        node11.right = node22;
        node21.left = node31;
        node21.right = node32;
        node22.left = node33;
        node22.right = node34;

        assertEquals(1, solution.kthSmallest(node11, 1));
        assertEquals(2, solution.kthSmallest(node11, 2));
        assertEquals(3, solution.kthSmallest(node11, 3));
        assertEquals(4, solution.kthSmallest(node11, 4));
        assertEquals(6, solution.kthSmallest(node11, 5));
        assertEquals(7, solution.kthSmallest(node11, 6));
        assertEquals(9, solution.kthSmallest(node11, 7));
    }


}
