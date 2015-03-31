package com.leetcode.problem111.minimumdepthofbinarytree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, find its maximum depth.
 * 
 * The maximum depth is the number of nodes along the longest path from the root
 * node down to the farthest leaf node.
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
        assertEquals(1, solution.minDepth(root));

        TreeNode left = new TreeNode(2);
        root.left = left;
        assertEquals(2, solution.minDepth(root));
    }
}