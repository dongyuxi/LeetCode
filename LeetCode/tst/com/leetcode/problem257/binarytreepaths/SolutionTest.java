package com.leetcode.problem257.binarytreepaths;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, return all root-to-leaf paths.
 * 
 * For example, given the following binary tree:
 * 
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 * All root-to-leaf paths are:
 * 
 * ["1->2->5", "1->3"]
 * 
 * @author dongyuxi
 *
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
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
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node2.right = node5;
        assertEquals(Arrays.asList("1->2->5", "1->3"), solution.binaryTreePaths(node1));
    }
}