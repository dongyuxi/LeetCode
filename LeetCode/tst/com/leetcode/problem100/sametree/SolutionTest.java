package com.leetcode.problem100.sametree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given two binary trees, write a function to check if they are equal or not.
 * 
 * Two binary trees are considered equal if they are structurally identical and
 * the nodes have the same value.
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
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        assertEquals(true, solution.isSameTree(p, q));
    }
}