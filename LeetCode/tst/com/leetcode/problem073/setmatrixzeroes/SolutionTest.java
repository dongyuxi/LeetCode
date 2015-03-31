package com.leetcode.problem073.setmatrixzeroes;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.Utils;

/**
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0.
 * Do it in place.
 * 
 * click to show follow up. Follow up:
 * 
 * Did you use extra space? A straight forward solution using O(mn) space is
 * probably a bad idea. A simple improvement uses O(m + n) space, but still not
 * the best solution. Could you devise a constant space solution?
 * 
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
        int[][] matrix = new int[][]{{1, 0}, {1, 1}};
        solution.setZeroes(matrix);
        Utils.showArray(matrix);
    }
}