package com.leetcode.problem235.lowestcommonancestorofabinarysearchtree;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes
 * in the tree.
 * 
 * According to the definition of LCA on Wikipedia: ��The lowest common ancestor
 * is defined between two nodes v and w as the lowest node in T that has both v
 * and w as descendants (where we allow a node to be a descendant of itself).��
 * 
 *          _______6______
 *         /              \
 *      ___2__          ___8__ 
 *     /      \        /      \
 *    0       _4      7        9
 *            / \
 *           3   5
 * For example, the lowest common ancestor (LCA) of nodes 5 and 1 is 3.
 * Another example is LCA of nodes 5 and 4 is 5, since a node can be a descendant
 * of itself according to the LCA definition.
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (null == root) {
            return null;
        }

        if ((root.val <= p.val && root.val >= q.val) || (root.val >= p.val && root.val <= q.val)) {
            return root;
        }

        if (root.val < p.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        
        if (root.val > p.val) {
            return lowestCommonAncestor(root.left, p, q);
        }

        return null;
    }
}
