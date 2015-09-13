package com.leetcode.problem114.flattenbinarytreetolinkedlist;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, flatten it to a linked list in-place.
 * 
 * For example,
 * Given
 * 
 *          1
 *         / \
 *        2   5
 *       / \   \
 *      3   4   6
 * The flattened tree should look like:
 *    1
 *     \
 *      2
 *       \
 *        3
 *         \
 *          4
 *           \
 *            5
 *             \
 *              6
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
        TreeNode node11 = new TreeNode(1);
        TreeNode node21 = new TreeNode(2);
        TreeNode node22 = new TreeNode(5);
        TreeNode node31 = new TreeNode(3);
        TreeNode node32 = new TreeNode(4);
        TreeNode node33 = new TreeNode(6);

        node11.left = node21;
        node11.right = node22;
        node21.left = node31;
        node21.right = node32;
        node22.right = node33;

        solution.flatten(node11);
        node11.inorder();
        node11.preorder();
    }
}