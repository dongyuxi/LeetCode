package com.leetcode.problem152.maximumproductsubarray;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest product.
 * 
 * For example, given the array [2,3,-2,4], the contiguous subarray [2,3] has
 * the largest product = 6.
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
        assertEquals(6, solution.maxProduct(new int[]{2, 3, -2, 4}));
    }
}