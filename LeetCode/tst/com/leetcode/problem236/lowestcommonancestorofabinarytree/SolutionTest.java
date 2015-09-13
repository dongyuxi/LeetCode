package com.leetcode.problem236.lowestcommonancestorofabinarytree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes
 * in the tree.
 * 
 * According to the definition of LCA on Wikipedia: ¡°The lowest common ancestor
 * is defined between two nodes v and w as the lowest node in T that has both v
 * and w as descendants (where we allow a node to be a descendant of itself).¡±
 * 
 *          _______3______
 *         /              \
 *      ___5__          ___1__ 
 *     /      \        /      \
 *     6      _2      0        8
 *            / \
 *           7   4
 * For example, the lowest common ancestor (LCA) of nodes 5 and 1 is 3.
 * Another example is LCA of nodes 5 and 4 is 5, since a node can be a descendant
 * of itself according to the LCA definition.
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
        TreeNode node11 = new TreeNode(3);
        TreeNode node21 = new TreeNode(5);
        TreeNode node22 = new TreeNode(1);
        TreeNode node31 = new TreeNode(6);
        TreeNode node32 = new TreeNode(2);
        TreeNode node33 = new TreeNode(0);
        TreeNode node34 = new TreeNode(8);
        TreeNode node41 = new TreeNode(7);
        TreeNode node42 = new TreeNode(4);
        node11.left = node21;
        node11.right = node22;
        node21.left = node31;
        node21.right = node32;
        node22.left = node33;
        node22.right = node34;
        node32.left = node41;
        node32.right = node42;

        assertEquals(node11, solution.lowestCommonAncestor(node11, node21, node22));
        assertEquals(node21, solution.lowestCommonAncestor(node11, node21, node42));
    }

}
