package com.leetcode.problem015.threesum;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a +
 * b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * 
 * Note:
 * 
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ¡Ü b ¡Ü
 * c) The solution set must not contain duplicate triplets.
 * 
 * For example, given array S = {-1 0 1 2 -1 -4},
 * 
 * A solution set is: (-1, 0, 1) (-1, -1, 2)
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
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = solution.threeSum(nums);
        showListList(list);
    }

    @Test
    public void testWrongAnswer() {
        int[] nums = new int[]{0, 0, 0, 0};
        List<List<Integer>> list = solution.threeSum(nums);
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