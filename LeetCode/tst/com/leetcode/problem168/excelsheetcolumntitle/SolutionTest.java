package com.leetcode.problem168.excelsheetcolumntitle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given a positive integer, return its corresponding column title as appear in
 * an Excel sheet.
 * 
 * For example:
 *  1 -> A
 *  2 -> B
 *  3 -> C
 *  ...
 *  26 -> Z
 *  27 -> AA
 *  28 -> AB 
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
    public void testValidInput() {
        assertEquals("A", solution.convertToTitle(1));
        assertEquals("B", solution.convertToTitle(2));
        assertEquals("Z", solution.convertToTitle(26));
        assertEquals("AA", solution.convertToTitle(27));
        assertEquals("ZZ", solution.convertToTitle(702));
        assertEquals("AAA", solution.convertToTitle(703));
    }
}