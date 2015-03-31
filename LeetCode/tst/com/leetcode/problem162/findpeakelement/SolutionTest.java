package com.leetcode.problem162.findpeakelement;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * A peak element is an element that is greater than its neighbors.
 * 
 * Given an input array where num[i] ¡Ù num[i+1], find a peak element and return
 * its index.
 * 
 * The array may contain multiple peaks, in that case return the index to any
 * one of the peaks is fine.
 * 
 * You may imagine that num[-1] = num[n] = -¡Þ.
 * 
 * For example, in array [1, 2, 3, 1], 3 is a peak element and your function
 * should return the index number 2.
 * 
 * Note: Your solution should be in logarithmic complexity.
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
        int[] array = new int[]{1, 2, 3, 1};
        assertEquals(2, solution.findPeakElement(array));
    }
}