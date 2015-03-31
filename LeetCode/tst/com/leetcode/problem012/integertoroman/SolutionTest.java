package com.leetcode.problem012.integertoroman;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given an integer, convert it to a roman numeral.
 * 
 * Input is guaranteed to be within the range from 1 to 3999.
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
        assertEquals("I", solution.intToRoman(1));
        assertEquals("X", solution.intToRoman(10));
        assertEquals("C", solution.intToRoman(100));
        assertEquals("MMMCMXCIX", solution.intToRoman(3999));
    }
}