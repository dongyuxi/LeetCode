package com.leetcode.problem074.searcha2dmatrix;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix.
 * This matrix has the following properties:
 * 
 * Integers in each row are sorted from left to right. The first integer of each
 * row is greater than the last integer of the previous row. For example,
 * 
 * Consider the following matrix:
 * 
 * [ 
 *  [1,  3,  5,  7 ],
 *  [10, 11, 16, 20],
 *  [23, 30, 34, 50]
 * ] Given target = 3, return
 * true.
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
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        assertEquals(true, solution.searchMatrix(matrix, 3));
        assertEquals(false, solution.searchMatrix(matrix, 6));
    }
}