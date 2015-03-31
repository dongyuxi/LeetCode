package com.leetcode.problem164.maximumgap;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given an unsorted array, find the maximum difference between the successive
 * elements in its sorted form.
 * 
 * Try to solve it in linear time/space.
 * 
 * Return 0 if the array contains less than 2 elements.
 * 
 * You may assume all elements in the array are non-negative integers and fit in
 * the 32-bit signed integer range.
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
        int[] num = new int[]{1, 4, 9};
        assertEquals(5, solution.maximumGap(num));
    }

    @Test
    public void testWrongAnswer() {
        int[] num = new int[]{1, 2};
        assertEquals(1, solution.maximumGap(num));
    }

    @Test
    public void testWrongAnswer2() {
        int[] num = new int[]{1,1,1,1,1,5,5,5,5,5};
        assertEquals(4, solution.maximumGap(num));
    }
}