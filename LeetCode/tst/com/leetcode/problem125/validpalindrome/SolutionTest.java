package com.leetcode.problem125.validpalindrome;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * 
 * For example, "A man, a plan, a canal: Panama" is a palindrome. "race a car"
 * is not a palindrome.
 * 
 * Note: Have you consider that the string might be empty? This is a good
 * question to ask during an interview.
 * 
 * For the purpose of this problem, we define empty string as valid palindrome.
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
        assertEquals(true, solution.isPalindrome(""));
        assertEquals(true, solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(false, solution.isPalindrome("race a car"));
    }

    @Test
    public void testWrongAnswer() {
        assertEquals(false, solution.isPalindrome("1a2"));
    }
}