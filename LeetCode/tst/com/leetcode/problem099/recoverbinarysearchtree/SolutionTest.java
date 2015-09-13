package com.leetcode.problem099.recoverbinarysearchtree;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 * Two elements of a binary search tree (BST) are swapped by mistake.
 * 
 * Recover the tree without changing its structure.
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
     *      2
     *     / \
     *    3   1
     */
    @Test
    public void test() {
        TreeNode node11 = new TreeNode(2);
        TreeNode node21 = new TreeNode(3);
        TreeNode node22 = new TreeNode(1);
        node11.left = node21;
        node11.right = node22;
        solution.recoverTree(node11);
        node11.inorder();
    }

}
