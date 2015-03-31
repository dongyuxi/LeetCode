package com.leetcode.problem108.convertsortedarraytobinarysearchtree;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given an array where elements are sorted in ascending order, convert it to a
 * height balanced BST.
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
        TreeNode root = solution.sortedArrayToBST(new int[]{1, 2, 3});
        root.inorder();
    }
}