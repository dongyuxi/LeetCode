package com.leetcode.problem018.foursum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c, and d in S such
 * that a + b + c + d = target? Find all unique quadruplets in the array which
 * gives the sum of target.
 * 
 * Note:
 * 
 * Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ��
 * b �� c �� d) The solution set must not contain duplicate quadruplets.
 * 
 * For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
 * 
 * A solution set is: (-1, 0, 0, 1) (-2, -1, 1, 2) (-2, 0, 0, 2)
 * 
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        if (null == num || num.length < 4) {
            return new ArrayList<List<Integer>>();
        }

        Arrays.sort(num);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < num.length - 3; i++) {
            if (i > 0 && num[i] == num[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < num.length - 2; j++) {
                if (j > i + 1 && num[j] == num[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = num.length - 1;
                while (k < l) {
                    if (k > j + 1 && num[k] == num[k - 1]) {
                        k++;
                        continue;
                    }
                    if (l < num.length - 1 && num[l] == num[l + 1]) {
                        l--;
                        continue;
                    }
                    int sum = num[i] + num[j] + num[k] + num[l];
                    if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        List<Integer> tempList = new ArrayList<Integer>();
                        tempList.add(num[i]);
                        tempList.add(num[j]);
                        tempList.add(num[k]);
                        tempList.add(num[l]);
                        list.add(tempList);
                        k++;
                    }
                }
            }
        }

        return list;
    }
}