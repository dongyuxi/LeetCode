package com.leetcode.problem013.romantointeger;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given a roman numeral, convert it to an integer.
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
        assertEquals(1, solution.romanToInt("I"));
        assertEquals(10, solution.romanToInt("X"));
        assertEquals(100, solution.romanToInt("C"));
        assertEquals(3999, solution.romanToInt("MMMCMXCIX"));
    }
}