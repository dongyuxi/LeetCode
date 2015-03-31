package com.leetcode.problem088.mergesortedarray;

import org.junit.Before;
import org.junit.Test;

/**
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * 
 * Note: You may assume that A has enough space (size that is greater or equal
 * to m + n) to hold additional elements from B. The number of elements
 * initialized in A and B are m and n respectively.
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
        int[] A = new int[]{1, 2, 3, 0, 0, 0};
        int[] B = new int[]{4, 5, 6};
        solution.merge(A, 3, B, 3);
        showArray(A);
    }

    private void showArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
}