package com.leetcode.problem020.validparentheses;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not.
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
    public void testInvalidInput() {
        assertEquals(false, solution.isValid(null));
        assertEquals(false, solution.isValid(""));
        assertEquals(false, solution.isValid("{"));
    }

    @Test
    public void testValidInput() {
        assertEquals(true, solution.isValid("()[]{}"));
        assertEquals(true, solution.isValid("([])"));
        assertEquals(false, solution.isValid("(]"));
        assertEquals(false, solution.isValid("([)]"));
    }
}