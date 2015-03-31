package com.leetcode.problem063.uniquepathsii;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Follow up for "Unique Paths":
 * 
 * Now consider if some obstacles are added to the grids. How many unique paths
 * would there be?
 * 
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * 
 * For example,
 * 
 * There is one obstacle in the middle of a 3x3 grid as illustrated below.
 * 
 * [
 *  [0,0,0],
 *  [0,1,0],
 *  [0,0,0]
 * ]
 * 
 * The total number of unique paths is 2.
 * 
 * Note: m and n will be at most 100.
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
        int[][] obstacleGrid = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        assertEquals(2, solution.uniquePathsWithObstacles(obstacleGrid));
    }

    @Test
    public void testWrongAnswer() {
        int[][] obstacleGrid = new int[][]{{1, 0}};
        assertEquals(0, solution.uniquePathsWithObstacles(obstacleGrid));
    }
}