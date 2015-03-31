package com.leetcode.problem094.binarytreeinordertraversal;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;
import com.leetcode.problem.utils.Utils;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * 
 * For example: Given binary tree {1,#,2,3},
 * 
 *   1 
 *    \
 *     2 
 *    /
 *   3
 * 
 * return [1,3,2].
 * 
 * Note: Recursive solution is trivial, could you do it iteratively?
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
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.right = node2;
        node2.left = node3;
        Utils.showList(solution.inorderTraversal(node1));
    }
}