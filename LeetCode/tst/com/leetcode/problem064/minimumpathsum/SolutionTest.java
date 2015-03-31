package com.leetcode.problem064.minimumpathsum;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given a m x n grid filled with non-negative numbers, find a path from top
 * left to bottom right which minimizes the sum of all numbers along its path.
 * 
 * Note: You can only move either down or right at any point in time.
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
        int[][] grid = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        assertEquals(0, solution.minPathSum(grid));
    }
}