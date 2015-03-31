package com.leetcode.problem041.firstmissingpositive;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given an unsorted integer array, find the first missing positive integer.
 * 
 * For example, Given [1,2,0] return 3, and [3,4,-1,1] return 2.
 * 
 * Your algorithm should run in O(n) time and uses constant space.
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
        int[] array = new int[]{1, 2, 0};
        assertEquals(3, solution.firstMissingPositive(array));

        array = new int[]{3, 4, -1, 1};
        assertEquals(2, solution.firstMissingPositive(array));

        array = new int[]{1, 2, 3, 4};
        assertEquals(5, solution.firstMissingPositive(array));
    }

    @Test
    public void testWrongAnswer() {
        int[] array = new int[]{};
        assertEquals(1, solution.firstMissingPositive(array));
    }
}