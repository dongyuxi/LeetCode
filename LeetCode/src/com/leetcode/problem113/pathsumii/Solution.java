package com.leetcode.problem113.pathsumii;

import java.util.ArrayList;
import java.util.List;

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
 *       /  \    / \
 *      7    2  5   1
 *  return
 *  [
 *      [5,4,11,2],
 *      [5,8,4,5]
 *  ]
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    List<List<Integer>> paths = new ArrayList<List<Integer>>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (null == root) {
            return this.paths;
        }

        List<Integer> list = new ArrayList<Integer>();
        pathSum(root, sum, list);
        return this.paths;
    }

    private void pathSum(TreeNode root, int sum, List<Integer> list) {
        list.add(root.val);
        if (null == root.left && null == root.right) {
            if (sum == root.val) {
                this.paths.add(new ArrayList<Integer>(list));
            }
        }

        if (null != root.left) {
            pathSum(root.left, sum - root.val, list);
        }
        if (null != root.right) {
            pathSum(root.right, sum - root.val, list);
        }

        list.remove(list.size() - 1);
    }

}
