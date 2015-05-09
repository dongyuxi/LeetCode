package com.leetcode.problem199.binarytreerightsideview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, imagine yourself standing on the right side of it, 
 * return the values of the nodes you can see ordered from top to bottom.
 * 
 * For example:
 * Given the following binary tree,
 *    1            <---
 *  /   \
 * 2     3         <---
 *  \     \
 *   5     4       <---
 * You should return [1, 3, 4].
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
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> righSideList = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (null != root) {
            queue.add(root);
            int size = queue.size();
            while (!queue.isEmpty()) {
                TreeNode element = queue.poll();;
                size--;
                if (null != element.left) {
                    queue.add(element.left);
                }
                if (null != element.right) {
                    queue.add(element.right);
                }
                if (0 == size) {
                    righSideList.add(element.val);
                    size = queue.size();
                }
            }
        }
        return righSideList;
    }
}