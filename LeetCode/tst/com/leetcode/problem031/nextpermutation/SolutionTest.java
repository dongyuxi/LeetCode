package com.leetcode.problem031.nextpermutation;

import org.junit.Before;
import org.junit.Test;

/**
 * Implement next permutation, which rearranges numbers into the
 * lexicographically next greater permutation of numbers.
 * 
 * If such arrangement is not possible, it must rearrange it as the lowest
 * possible order (ie, sorted in ascending order).
 * 
 * The replacement must be in-place, do not allocate extra memory.
 * 
 * Here are some examples. Inputs are in the left-hand column and its
 * corresponding outputs are in the right-hand column.
 * 1,2,3 ¡ú 1,3,2
 * 3,2,1 ¡ú 1,2,3
 * 1,1,5 ¡ú 1,5,1
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
        int[] input = new int[]{1, 2, 3};
        solution.nextPermutation(input);
        showArray(input);

        input = new int[]{3, 2, 1};
        solution.nextPermutation(input);
        showArray(input);

        input = new int[]{1, 1, 5};
        solution.nextPermutation(input);
        showArray(input);
    }

    @Test
    public void testWrongAnswer() {
        int[] input = new int[]{1, 3, 2};
        solution.nextPermutation(input);
        showArray(input);

        input = new int[]{2, 3, 1};
        solution.nextPermutation(input);
        showArray(input);
    }

    private void showArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
}