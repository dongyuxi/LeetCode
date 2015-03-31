package com.leetcode.problem110.balancedbinarytree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, determine if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more
 * than 1.
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
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        assertEquals(true, solution.isBalanced(root));

        TreeNode leftleft = new TreeNode(4);
        left.left = leftleft;
        assertEquals(true, solution.isBalanced(root));

        TreeNode leftleftleft = new TreeNode(5);
        leftleft.left = leftleftleft;
        assertEquals(false, solution.isBalanced(root));
    }
}