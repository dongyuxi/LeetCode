package com.leetcode.problem116.populatingnextrightpointersineachnode;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeLinkNode;

/**
 * Given a binary tree
 * 
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 * 
 * Initially, all next pointers are set to NULL.
 * 
 * Note:
 * 
 * You may only use constant extra space.
 * You may assume that it is a perfect binary tree 
 * (ie, all leaves are at the same level, and every parent has two children).
 * For example,
 * Given the following perfect binary tree,
 *          1
 *        /  \
 *       2    3
 *      / \  / \
 *     4  5  6  7
 * After calling your function, the tree should look like:
 *          1 -> NULL
 *        /  \
 *       2 -> 3 -> NULL
 *      / \  / \
 *     4->5->6->7 -> NULL
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
        TreeLinkNode node11 = new TreeLinkNode(1);
        TreeLinkNode node21 = new TreeLinkNode(2);
        TreeLinkNode node22 = new TreeLinkNode(3);
        TreeLinkNode node31 = new TreeLinkNode(4);
        TreeLinkNode node32 = new TreeLinkNode(5);
        TreeLinkNode node33 = new TreeLinkNode(6);
        TreeLinkNode node34 = new TreeLinkNode(7);
        node11.left = node21;
        node11.right = node22;
        node21.left = node31;
        node21.right = node32;
        node22.left = node33;
        node22.right = node34;

        solution.connect(node11);
        node11.inorder();
    }
}
