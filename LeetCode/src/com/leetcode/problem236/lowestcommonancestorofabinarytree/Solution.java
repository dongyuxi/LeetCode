package com.leetcode.problem236.lowestcommonancestorofabinarytree;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes
 * in the tree.
 * 
 * According to the definition of LCA on Wikipedia: ¡°The lowest common ancestor
 * is defined between two nodes v and w as the lowest node in T that has both v
 * and w as descendants (where we allow a node to be a descendant of itself).¡±
 * 
 *          _______3______
 *         /              \
 *      ___5__          ___1__ 
 *     /      \        /      \
 *     6      _2      0        8
 *            / \
 *           7   4
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

        List<TreeNode> pList = new ArrayList<TreeNode>();
        getPathFromRoot(root, p, pList);
        List<TreeNode> qList = new ArrayList<TreeNode>();
        getPathFromRoot(root, q, qList);

        TreeNode ancestor = root;
        for (int i = 0; i < Math.min(pList.size(), qList.size()); i++) {
            if (pList.get(i) != qList.get(i)) {
                break;
            }
            ancestor = pList.get(i);
        }

        return ancestor;
    }

    private boolean getPathFromRoot(TreeNode root, TreeNode p, List<TreeNode> list) {
        if (null == root) {
            return false;
        }

        list.add(root);

        if (root == p) {
            return true;
        }

        if (null != root.left) {
            if (getPathFromRoot(root.left, p, list)) {
                return true;
            }
        }

        if (null != root.right) {
            if (getPathFromRoot(root.right, p, list)) {
                return true;
            }
        }

        list.remove(list.size() - 1);

        return false;
    }
}
