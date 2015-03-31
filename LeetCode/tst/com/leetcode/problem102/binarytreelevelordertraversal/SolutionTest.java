package com.leetcode.problem102.binarytreelevelordertraversal;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. 
 * (ie, from left to right, level by level from leaf to root).
 * 
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *   3
 *  / \
 * 9  20
 *   /  \
 *  15   7
 *  return its bottom-up level order traversal as:
 * [
 *  [3],
 *  [9,20],
 *  [15,7]
 * ]
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
        List<List<Integer>> list = solution.levelOrder(node11);
        printListList(list);

        TreeNode node21 = new TreeNode(9);
        TreeNode node22 = new TreeNode(20);
        node11.left = node21;
        node11.right = node22;
        list = solution.levelOrder(node11);
        printListList(list);
    }

    private void printListList(List<List<Integer>> list) {
        for (List<Integer> l : list) {
            for (Integer i : l) {
                System.out.print(i + ",");
            }
            System.out.println();
        }
    }
}