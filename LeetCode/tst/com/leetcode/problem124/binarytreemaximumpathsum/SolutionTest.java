package com.leetcode.problem124.binarytreemaximumpathsum;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, find the maximum path sum.
 * 
 * The path may start and end at any node in the tree.
 * 
 * For example: Given the below binary tree,
 * 
 *   1
 *  / \
 * 2   3
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
        TreeNode node22 = new TreeNode(3);
        node11.left = node21;
        node11.right = node22;

        assertEquals(6, solution.maxPathSum(node11));
    }

    /**
     *           9
     *         6   -3
     *           -6    2
     *               2
     *             -6 -6
     *            -6
     */
    
    //[9,6,-3,null,null,-6,2,null,null,2,null,-6,-6,-6]
    @Test
    public void testWrongAnswer1() {
        TreeNode node11 = new TreeNode(9);
        TreeNode node21 = new TreeNode(6);
        TreeNode node22 = new TreeNode(-3);
        TreeNode node31 = new TreeNode(-6);
        TreeNode node32 = new TreeNode(2);
        TreeNode node41 = new TreeNode(2);
        TreeNode node51 = new TreeNode(-6);
        TreeNode node52 = new TreeNode(-6);
        TreeNode node61 = new TreeNode(-6);
        node11.left = node21;
        node11.right = node22;
        node22.left = node31;
        node22.right = node32;
        node32.left = node41;
        node41.left = node51;
        node41.right = node52;
        node51.left = node61;

        assertEquals(16, solution.maxPathSum(node11));
    }

}
