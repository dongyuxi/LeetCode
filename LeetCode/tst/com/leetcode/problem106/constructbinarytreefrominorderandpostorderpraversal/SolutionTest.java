package com.leetcode.problem106.constructbinarytreefrominorderandpostorderpraversal;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * 
 * Note: You may assume that duplicates do not exist in the tree.
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
        int[] inorder = new int[]{1, 2, 3};
        int[] postorder = new int[]{1, 3, 2};
        TreeNode root = solution.buildTree(inorder, postorder);
        root.inorder();
        root.postorder();
    }
}