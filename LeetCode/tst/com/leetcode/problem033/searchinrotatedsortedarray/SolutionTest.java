package com.leetcode.problem033.searchinrotatedsortedarray;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * You are given a target value to search. If found in the array return its
 * index, otherwise return -1.
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
        int[] array = new int[]{4, 5, 6, 7, 0, 1, 2};
        assertEquals(0, solution.search(array, 4));
        assertEquals(1, solution.search(array, 5));
        assertEquals(2, solution.search(array, 6));
        assertEquals(3, solution.search(array, 7));
        assertEquals(4, solution.search(array, 0));
        assertEquals(5, solution.search(array, 1));
        assertEquals(6, solution.search(array, 2));
    }

    @Test
    public void testWrongAnswer() {
        int[] array = new int[]{1};
        assertEquals(0, solution.search(array, 1));
        assertEquals(-1, solution.search(array, 0));
    }
}