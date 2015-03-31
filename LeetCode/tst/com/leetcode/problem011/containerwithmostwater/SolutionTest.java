package com.leetcode.problem011.containerwithmostwater;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of line i is at (i, ai) and (i, 0). Find two lines, which together with
 * x-axis forms a container, such that the container contains the most water.
 * 
 * Note: You may not slant the container.
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
    public void testHeightNull() {
        assertEquals(0, solution.maxArea(null));
    }

    @Test
    public void testHeight() {
        assertEquals(24, solution.maxArea(new int[]{4,6,2,6,7,11,2}));
    }
}
