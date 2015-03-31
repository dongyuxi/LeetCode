package com.leetcode.problem102.binarytreelevelordertraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelList = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (null != root) {
            queue.add(root);
            int size = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            while (!queue.isEmpty()) {
                TreeNode element = queue.poll();;
                list.add(element.val);
                size--;
                if (null != element.left) {
                    queue.add(element.left);
                }
                if (null != element.right) {
                    queue.add(element.right);
                }
                if (0 == size) {
                    levelList.add(list);
                    list = new ArrayList<Integer>();
                    size = queue.size();
                }
            }
        }
        return levelList;
    }
}