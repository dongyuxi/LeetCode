package com.leetcode.problem074.searcha2dmatrix;

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
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (null == matrix || 0 == matrix.length) {
            return false;
        }

        int curRow = 0;
        int curCol = matrix[0].length - 1;
        while (curRow < matrix.length && curCol >= 0) {
            if (matrix[curRow][curCol] == target) {
                return true;
            }
            if (matrix[curRow][curCol] < target) {
                curRow++;
            } else {
                curCol--;
            }
        }

        return false;
    }
}