package com.leetcode.problem078.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of distinct integers, S, return all possible subsets.
 * 
 * Note:
 * 
 * Elements in a subset must be in non-descending order. The solution set must
 * not contain duplicate subsets.
 * 
 * For example, If S = [1,2,3], a solution is:
 * 
 * [ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2], [] ]
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> listlist = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        if (null == S || 0 == S.length) {
            listlist.add(list);
            return listlist;
        }

        Arrays.sort(S);
        subsets(S, 0, 0, list, listlist);
        return listlist;
    }

    private void subsets(int[] S, int index, int depth,
            List<Integer> list, List<List<Integer>> listlist) {
        if (depth > S.length) {
            return;
        }
        listlist.add(new ArrayList<Integer>(list));
        for (int i = index; i < S.length; i++) {
            list.add(S[i]);
            subsets(S, i + 1, depth + 1, list, listlist);
            list.remove(list.size() - 1);
        }
    }
}