package com.leetcode.problem226.invertbinarytree;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 * Invert a binary tree.
 * 
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * to
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
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

        solution.invertTree(node11).inorder();
    }

}
