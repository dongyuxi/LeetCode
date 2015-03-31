package com.leetcode.problem006.zigzagconversion;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 *  The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 *  (you may want to display this pattern in a fixed font for better legibility)
 *  P   A   H   N
 *  A P L S I I G
 *  Y   I   R
 *  And then read line by line: "PAHNAPLSIIGYIR"
 *  Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR". 
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
        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
    }
}