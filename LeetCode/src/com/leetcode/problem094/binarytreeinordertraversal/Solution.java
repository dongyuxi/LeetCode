package com.leetcode.problem094.binarytreeinordertraversal;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * 
 * For example: Given binary tree {1,#,2,3},
 * 
 *   1 
 *    \
 *     2 
 *    /
 *   3
 * 
 * return [1,3,2].
 * 
 * Note: Recursive solution is trivial, could you do it iteratively?
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (null == root) {
            return list;
        }

        inorderTraversal(root, list);

        return list;
    }

    private void inorderTraversal(TreeNode root, List<Integer> list) {
        if (null == root) {
            return;
        }
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }
}