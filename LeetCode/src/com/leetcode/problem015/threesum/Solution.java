package com.leetcode.problem015.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a +
 * b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * 
 * Note:
 * 
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a �� b ��
 * c) The solution set must not contain duplicate triplets.
 * 
 * For example, given array S = {-1 0 1 2 -1 -4},
 * 
 * A solution set is: (-1, 0, 1) (-1, -1, 2)
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        if (null == num || num.length < 3) {
            return new ArrayList<List<Integer>>();
        }

        Arrays.sort(num);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < num.length - 2; i++) {
            if (i > 0 && num[i] == num[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = num.length - 1;
            while (j < k) {
                if (j > i + 1 && num[j] == num[j - 1]) {
                    j++;
                    continue;
                }
                if (k < num.length - 1 && num[k] == num[k + 1]) {
                    k--;
                    continue;
                }
                int sum = num[i] + num[j] + num[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> tempList = new ArrayList<Integer>();
                    tempList.add(num[i]);
                    tempList.add(num[j]);
                    tempList.add(num[k]);
                    list.add(tempList);
                    j++;
                }
            }
        }

        return list;
    }
}