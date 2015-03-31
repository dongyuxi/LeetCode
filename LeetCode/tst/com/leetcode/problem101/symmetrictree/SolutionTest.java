package com.leetcode.problem101.symmetrictree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * For example, this binary tree is symmetric:
 * 
 *       1
 *      / \
 *     2   2
 *    / \ / \
 *   3  4 4  3
 * But the following is not:
 *       1
 *      / \
 *     2   2
 *      \   \
 *      3    3
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
        assertEquals(true, solution.isSymmetric(root));

        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        root.left = left;
        root.right = right;
        assertEquals(true, solution.isSymmetric(root));

        TreeNode leftleft = new TreeNode(3);
        TreeNode rightright = new TreeNode(3);
        left.left = leftleft;
        right.right = rightright;
        assertEquals(true, solution.isSymmetric(root));

        rightright = new TreeNode(4);
        left.left = leftleft;
        right.right = rightright;
        assertEquals(false, solution.isSymmetric(root));
    }
}