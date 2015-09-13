package com.leetcode.problem219.containsduplicateii;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given an array of integers and an integer k, find out whether there are two
 * distinct indices i and j in the array such that nums[i] = nums[j] and the
 * difference between i and j is at most k.
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
        assertEquals(true, solution.containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 3));
        assertEquals(false, solution.containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 2));
    }

    @Test
    public void testWrongAnswer() {
        assertEquals(true, solution.containsNearbyDuplicate(new int[] { 1, 0, 1, 1 }, 1));
    }

}
