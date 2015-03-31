package com.leetcode.problem151.reversewordsinastring;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given an input string, reverse the string word by word.
 * 
 * For example, Given s = "the sky is blue", return "blue is sky the".
 * 
 * Update (2015-02-12): For C programmers: Try to solve it in-place in O(1)
 * space.
 * 
 * click to show clarification. Clarification:
 * 
 * What constitutes a word?
 * A sequence of non-space characters constitutes a word.
 * 
 * Could the input string contain leading or trailing spaces?
 * Yes. However, your reversed string should not contain leading or trailing spaces.
 * 
 * How about multiple spaces between two words?
 * Reduce them to a single space in the reversed string.
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
        assertEquals("blue is sky the", solution.reverseWords("the sky is blue"));
    }
}