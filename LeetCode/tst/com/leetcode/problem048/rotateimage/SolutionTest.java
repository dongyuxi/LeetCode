package com.leetcode.problem048.rotateimage;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.Utils;

/**
 * You are given an n x n 2D matrix representing an image.
 * 
 * Rotate the image by 90 degrees (clockwise).
 * 
 * Follow up: Could you do this in-place?
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
        int[][] matrix = new int[][]{{0, 1}, {2, 3}};
        solution.rotate(matrix);
        Utils.showArray(matrix);
    }
}