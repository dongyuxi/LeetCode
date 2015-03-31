package com.leetcode.problem129.sumroottoleafnumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path
 * could represent a number.
 * 
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * 
 * Find the total sum of all root-to-leaf numbers.
 * 
 * For example,
 *     1
 *    / \
 *   2   3
 * 
 * The root-to-leaf path 1->2 represents the number 12. The root-to-leaf path
 * 1->3 represents the number 13.
 * 
 * Return the sum = 12 + 13 = 25.
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
        TreeNode leftleft = new TreeNode(4);
        left.left = leftleft;
        assertEquals(137, solution.sumNumbers(root));
    }
}