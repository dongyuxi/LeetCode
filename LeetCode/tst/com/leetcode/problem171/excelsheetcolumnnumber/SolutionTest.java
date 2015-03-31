package com.leetcode.problem171.excelsheetcolumnnumber;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Related to question Excel Sheet Column Title

 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * 
 * For example:
 *  A -> 1
 *  B -> 2
 *  C -> 3
 *  ...
 *  Z -> 26
 *  AA -> 27
 *  AB -> 28
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
        assertEquals(1, solution.titleToNumber("A"));
        assertEquals(2, solution.titleToNumber("B"));
        assertEquals(3, solution.titleToNumber("C"));
        assertEquals(26, solution.titleToNumber("Z"));
        assertEquals(27, solution.titleToNumber("AA"));
        assertEquals(28, solution.titleToNumber("AB"));
        assertEquals(702, solution.titleToNumber("ZZ"));
        assertEquals(703, solution.titleToNumber("AAA"));
    }
}
