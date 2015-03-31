package com.leetcode.problem096.uniquebinarysearchtrees;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.problem.utils.TreeNode;

/**
 * Given n, generate all structurally unique BST's (binary search trees) that store values 1...n.
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 * 
 *  1         3     3      2      1
 *   \       /     /      / \      \
 *    3     2     1      1   3      2
 *   /     /       \                 \
 *  2     1         2                 3
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        if (n <= 0) {
            return list;
        }

        
        return list;
    }
}