package com.leetcode.problem034.searchforarange;

import org.junit.Before;
import org.junit.Test;

/**
 * Given a sorted array of integers, find the starting and ending position of a
 * given target value.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * If the target is not found in the array, return [-1, -1].
 * 
 * For example, Given [5, 7, 7, 8, 8, 10] and target value 8, return [3, 4].
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
        int[] array = new int[]{5, 7, 7, 8, 8, 10};
        showArray(solution.searchRange(array, 8));

        array = new int[]{8, 8, 8, 8, 8, 8};
        showArray(solution.searchRange(array, 8));
    }

    private void showArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
}