package com.leetcode.problem189.rotatearray;

import org.junit.Before;
import org.junit.Test;

/**
 * Rotate an array of n elements to the right by k steps.
 * 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to
 * [5,6,7,1,2,3,4].
 * 
 * Note: Try to come up as many solutions as you can, there are at least 3
 * different ways to solve this problem.
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
    public void testValidInput() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        solution.rotate(array, 3);
        showArray(array);
    }

    private void showArray(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}