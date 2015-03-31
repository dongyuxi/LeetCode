package com.leetcode.problem054.spiralmatrix;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of
 * the matrix in spiral order.
 * 
 * For example, Given the following matrix:
 * 
 * [ 
 *   [ 1, 2, 3 ],
 *   [ 4, 5, 6 ],
 *   [ 7, 8, 9 ]
 * ]
 * 
 * You should return [1,2,3,6,9,8,7,4,5].
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        if (null == matrix) {
            return list;
        }

        int n = matrix[0].length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
            }
        }

        return list;
    }
}