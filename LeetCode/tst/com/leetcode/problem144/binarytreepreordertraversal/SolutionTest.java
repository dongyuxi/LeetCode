package com.leetcode.problem144.binarytreepreordertraversal;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * For example:
 * Given binary tree {1,#,2,3},
 * 
 *  1
 *   \
 *    2
 *   /
 *  3
 * return [1,2,3].
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
        TreeNode node11 = new TreeNode(1);
        TreeNode node21 = new TreeNode(2);
        TreeNode node31 = new TreeNode(3);
        node11.right = node21;
        node21.left = node31;
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(list, solution.preorderTraversal(node11));
    }
}