package com.leetcode.problem066.plusone;

import org.junit.Before;
import org.junit.Test;

/**
 * Given a non-negative number represented as an array of digits, plus one to
 * the number.
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list.
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
        int[] array = new int[]{5, 7, 7, 8, 8, 9};
        showArray(solution.plusOne(array));

        array = new int[]{9, 9, 9, 9, 9, 9};
        showArray(solution.plusOne(array));
    }

    private void showArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
}