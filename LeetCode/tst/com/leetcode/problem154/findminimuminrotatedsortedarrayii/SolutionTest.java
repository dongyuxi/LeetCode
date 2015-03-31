package com.leetcode.problem154.findminimuminrotatedsortedarrayii;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem154.findminimuminrotatedsortedarrayii.Solution;

/**
 * Follow up for "Find Minimum in Rotated Sorted Array": What if duplicates are
 * allowed?
 * 
 * Would this affect the run-time complexity? How and why? Suppose a sorted
 * array is rotated at some pivot unknown to you beforehand.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * Find the minimum element.
 * 
 * The array may contain duplicates.
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
        int[] array = new int[]{1, 2, 2, 2, 2, 2};
        assertEquals(1, solution.findMin(array));

        array = new int[]{2, 2, 2, 2, 1, 2};
        assertEquals(1, solution.findMin(array));

        array = new int[]{2, 2, 2, 2, 2, 1};
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