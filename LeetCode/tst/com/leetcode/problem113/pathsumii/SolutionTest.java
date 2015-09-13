package com.leetcode.problem113.pathsumii;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 *  Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 *  For example:
 *  Given the below binary tree and sum = 22,
 *  
 *            5
 *           / \
 *          4   8
 *         /   / \
 *        11  13  4
 *       /  \      \
 *      7    2      1
 *  return
 *  [
 *      [5,4,11,2],
 *      [5,8,4,5]
 *  ]
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
        TreeNode node11 = new TreeNode(5);
        TreeNode node21 = new TreeNode(4);
        TreeNode node22 = new TreeNode(8);
        TreeNode node31 = new TreeNode(11);
        TreeNode node32 = new TreeNode(13);
        TreeNode node33 = new TreeNode(4);
        TreeNode node41 = new TreeNode(7);
        TreeNode node42 = new TreeNode(2);
        TreeNode node43 = new TreeNode(5);
        TreeNode node44 = new TreeNode(1);
        node11.left = node21;
        node11.right = node22;
        node21.left = node31;
        node22.left = node32;
        node22.right = node33;
        node31.left = node41;
        node31.right = node42;
        node33.left = node43;
        node33.right = node44;

        List<List<Integer>> paths = new ArrayList<List<Integer>>();
        paths.add(Arrays.asList(5, 4, 11, 2));
        paths.add(Arrays.asList(5, 8, 4, 5));
        assertEquals(paths, solution.pathSum(node11, 22));
    }

}
