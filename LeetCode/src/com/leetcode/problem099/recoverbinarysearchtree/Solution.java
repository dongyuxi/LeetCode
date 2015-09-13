package com.leetcode.problem099.recoverbinarysearchtree;

import com.leetcode.problem.utils.TreeNode;

/**
 * Two elements of a binary search tree (BST) are swapped by mistake.
 * 
 * Recover the tree without changing its structure.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    TreeNode preNode = null;
    TreeNode mistake1 = null;
    TreeNode mistake2 = null;

    public void recoverTree(TreeNode root) {
        if (null == root) {
            return;
        }

        preNode = null;
        mistake1 = null;
        mistake2 = null;

        inorder(root);

        if (null != mistake1 && null != mistake2) {
            int tmp = mistake1.val;
            mistake1.val = mistake2.val;
            mistake2.val = tmp;
        }
    }

    private void inorder(TreeNode root) {
        if (null == root) {
            return;
        }

        inorder(root.left);

        if (null != preNode) {
            if (preNode.val > root.val) {
                if (null == mistake1) {
                    mistake1 = preNode;
                }
                mistake2 = root;
            }
        }

        preNode = root;
        inorder(root.right);
    }
}
