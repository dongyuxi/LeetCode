package com.leetcode.problem018.foursum;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Given an array S of n integers, are there elements a, b, c, and d in S such
 * that a + b + c + d = target? Find all unique quadruplets in the array which
 * gives the sum of target.
 * 
 * Note:
 * 
 * Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ¡Ü
 * b ¡Ü c ¡Ü d) The solution set must not contain duplicate quadruplets.
 * 
 * For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
 * 
 * A solution set is: (-1, 0, 0, 1) (-2, -1, 1, 2) (-2, 0, 0, 2)
 * 
 * 
 * @author dongyuxi
 *
 */
public class SolutionTest {
    public Solution solution = null;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void test() {
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        List<List<Integer>> list = solution.fourSum(nums, 0);
        showListList(list);
    }

    @Test
    public void testAllZero() {
        int[] nums = new int[]{0, 0, 0, 0};
        List<List<Integer>> list = solution.fourSum(nums, 1);
        showListList(list);
    }

    private void showListList(List<List<Integer>> list) {
        for (List<Integer> tempList : list) {
            for (Integer i : tempList) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}