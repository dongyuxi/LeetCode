package com.leetcode.problem257.binarytreepaths;

import java.util.ArrayList;
import java.util.List;
import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, return all root-to-leaf paths.
 * 
 * For example, given the following binary tree:
 * 
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 * All root-to-leaf paths are:
 * 
 * ["1->2->5", "1->3"]
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

    private List<String> paths = new ArrayList<String>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root != null) {
            findPaths(root, String.valueOf(root.val));
        }
        return paths;
    }

    private void findPaths(TreeNode n, String path) {
        if (n.left == null && n.right == null) {
            paths.add(path);
        }
        if (n.left != null) {
            findPaths(n.left, path + "->" + n.left.val);
        }
        if (n.right != null) {
            findPaths(n.right, path + "->" + n.right.val);
        }
    }
}
