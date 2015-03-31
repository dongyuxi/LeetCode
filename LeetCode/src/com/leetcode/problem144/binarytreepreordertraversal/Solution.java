package com.leetcode.problem144.binarytreepreordertraversal;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * For example:
 * Given binary tree {1,#,2,3},
 * 
 *  1
 *   \
 *    2
 *   /
 *  3
 * return [1,2,3].
 * Note: Recursive solution is trivial, could you do it iteratively?
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        preorderTraversal(root, list);
        return list;
    }

    private void preorderTraversal(TreeNode root, List<Integer> list) {
        if (null != root) {
            list.add(root.val);
            preorderTraversal(root.left, list);
            preorderTraversal(root.right, list);
        }
    }
}