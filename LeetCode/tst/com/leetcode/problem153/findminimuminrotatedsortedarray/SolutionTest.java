package com.leetcode.problem153.findminimuminrotatedsortedarray;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem153.findminimuminrotatedsortedarray.Solution;

/**
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * Find the minimum element.
 * 
 * You may assume no duplicate exists in the array.
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
        int[] array = new int[]{1, 3, 5, 6, 9};
        assertEquals(1, solution.findMin(array));

        array = new int[]{5, 6, 9, 1, 3};
        assertEquals(1, solution.findMin(array));

        array = new int[]{9, 1, 3, 5, 6};
        assertEquals(1, solution.findMin(array));

        array = new int[]{3, 5, 6, 9, 1};
        assertEquals(1, solution.findMin(array));
    }

    @Test
    public void testWrongAnswer() {
        int[] array = new int[]{3, 1, 2};
        assertEquals(1, solution.findMin(array));

        array = new int[]{2, 1};
        assertEquals(1, solution.findMin(array));
    }
}