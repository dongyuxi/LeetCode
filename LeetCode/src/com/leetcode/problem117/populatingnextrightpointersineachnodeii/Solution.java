package com.leetcode.problem117.populatingnextrightpointersineachnodeii;

import java.util.LinkedList;
import java.util.Queue;

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
 *      / \    \
 *     4  5     7
 * After calling your function, the tree should look like:
 *          1 -> NULL
 *        /  \
 *       2 -> 3 -> NULL
 *      / \    \
 *     4-> 5 -> 7 -> NULL
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (null == root) {
            return;
        }

        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.add(root);
        int queueSize = queue.size();
        while (!queue.isEmpty()) {
            TreeLinkNode top = queue.poll();
            queueSize--;
            if (null != top.left) {
                queue.add(top.left);
            }
            if (null != top.right) {
                queue.add(top.right);
            }
            if (queueSize > 0) {
                top.next = queue.peek();
            } else {
                queueSize = queue.size();
            }
        }

        
    }
}
