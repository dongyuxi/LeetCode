package com.leetcode.problem036.validsudoku;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
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
        char[][] board = new char[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = '.';
            }
        }
        assertEquals(true, solution.isValidSudoku(board));
    }

    /**
     * "..5.....6",
     * "....14...",
     * ".........",
     * ".....92..",
     * "5....2...",
     * ".......3.",
     * "...54....",
     * "3.....42.",
     * "...27.6.."
     */
    @Test
    public void testWrongAnswer() {
        
    }
}