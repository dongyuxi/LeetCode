package com.leetcode.problem079.wordsearch;

/**
 * Given a 2D board and a word, find if the word exists in the grid.
 * 
 * The word can be constructed from letters of sequentially adjacent cell, where
 * "adjacent" cells are those horizontally or vertically neighboring. The same
 * letter cell may not be used more than once.
 * 
 * For example, Given board =
 * 
 * [
 *  ["ABCE"],
 *  ["SFCS"],
 *  ["ADEE"]
 * ]
 * 
 * word = "ABCCED", -> returns true,
 * word = "SEE", -> returns true,
 * word = "ABCB", -> returns false.
 * 
 * @author dongyuxi
 * 
 */
public class Solution {
    private static int[][] DIRECTION = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public boolean exist(char[][] board, String word) {
        if (null == board) {
            return false;
        }
        if (null == word || 0 == word.length()) {
            return true;
        }

        int rows = board.length;
        int cols = board[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] visited = new boolean[rows][cols];
                    visited[i][j] = true;
                    if (search(board, word, i, j, 1, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean search(char[][] board, String word, int row, int col,
            int index, boolean[][] visited) {
        if (index == word.length()) {
            return true;
        }
        int rows = board.length;
        int cols = board[0].length;
        for (int i = 0; i < 4; i++) {
            int nextRow = row + DIRECTION[i][0];
            int nextCol = col + DIRECTION[i][1];
            if (nextRow >= 0 && nextRow <= rows - 1 && nextCol >= 0
                    && nextCol <= cols - 1) {
                if (!visited[nextRow][nextCol]
                        && board[nextRow][nextCol] == word.charAt(index)) {
                    visited[nextRow][nextCol] = true;
                    if (search(board, word, nextRow, nextCol, index + 1,
                            visited)) {
                        return true;
                    }
                    visited[nextRow][nextCol] = false;
                }
            }
        }

        return false;
    }
}