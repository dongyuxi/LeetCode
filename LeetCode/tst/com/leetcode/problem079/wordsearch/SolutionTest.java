package com.leetcode.problem079.wordsearch;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

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
public class SolutionTest {
    public Solution solution = null;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void test() {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        assertEquals(true, solution.exist(board, "ABCCED"));
        assertEquals(true, solution.exist(board, "SEE"));
        assertEquals(false, solution.exist(board, "ABCB"));
    }

    @Test
    public void testWrongAnswer() {
        char[][] board = new char[][]{{'b', 'b'}, {'a', 'b'}, {'b', 'a'}};
        assertEquals(true, solution.exist(board, "a"));
    }
}