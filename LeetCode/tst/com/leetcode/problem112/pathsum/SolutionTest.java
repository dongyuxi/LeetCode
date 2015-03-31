package com.leetcode.problem112.pathsum;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 *  Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 *  For example:
 *  Given the below binary tree and sum = 22,
 *  
 *            5
 *           / \
 *          4   8
 *         /   / \
 *        11  13  4
 *       /  \      \
 *      7    2      1
 *  return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
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
        TreeNode node11 = new TreeNode(5);
        assertEquals(true, solution.hasPathSum(node11, 5));
        assertEquals(false, solution.hasPathSum(node11, 1));

        TreeNode node21 = new TreeNode(4);
        TreeNode node22 = new TreeNode(8);
        node11.left = node21;
        node11.right = node22;
        assertEquals(true, solution.hasPathSum(node11, 9));
        assertEquals(true, solution.hasPathSum(node11, 13));
    }

    @Test
    public void testWrongAnswer() {
        assertEquals(false, solution.hasPathSum(null, 0));

        TreeNode node11 = new TreeNode(1);
        TreeNode node21 = new TreeNode(2);
        node11.left = node21;
        assertEquals(false, solution.hasPathSum(node11, 1));
    }
}