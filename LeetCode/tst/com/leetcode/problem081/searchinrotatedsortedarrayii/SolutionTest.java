package com.leetcode.problem081.searchinrotatedsortedarrayii;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Follow up for "Search in Rotated Sorted Array": What if duplicates are
 * allowed?
 * 
 * Would this affect the run-time complexity? How and why?
 * 
 * Write a function to determine if a given target is in the array.
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
        int[] array = new int[]{4, 4, 4, 5, 6, 7, 0, 1, 2};
        assertEquals(true, solution.search(array, 4));
        assertEquals(false, solution.search(array, 3));
    }
}