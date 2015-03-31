package com.leetcode.problem098.validatebinarysearchtree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * 
 * Assume a BST is defined as follows:
 * 
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * 
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
        TreeNode root = new TreeNode(10);
        assertEquals(true, solution.isValidBST(root));

        TreeNode left = new TreeNode(9);
        root.left = left;
        TreeNode right = new TreeNode(11);
        root.right = right;
        assertEquals(true, solution.isValidBST(root));

        root.left = right;
        root.right = left;
        assertEquals(false, solution.isValidBST(root));
    }

    /**
     * {10,5,15,#,#,6,20}
     */
    @Test
    public void testWrongAnswer() {
        TreeNode node11 = new TreeNode(10);

        TreeNode node21 = new TreeNode(5);
        node11.left = node21;
        TreeNode node22 = new TreeNode(15);
        node11.right = node22;
        assertEquals(true, solution.isValidBST(node11));

        TreeNode node31 = new TreeNode(6);
        node22.left = node31;
        TreeNode node32 = new TreeNode(20);
        node22.right = node32;
        assertEquals(false, solution.isValidBST(node11));
    }

    /**
     * {2147483647}
     */
    @Test
    public void testWrongAnswer2() {
        TreeNode node11 = new TreeNode(2147483647);
        assertEquals(true, solution.isValidBST(node11));
    }
}