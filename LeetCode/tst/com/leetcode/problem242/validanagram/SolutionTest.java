package com.leetcode.problem242.validanagram;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given two strings s and t, write a function to determine if t is an anagram
 * of s.
 * 
 * For example, s = "anagram", t = "nagaram", return true. s = "rat", t = "car",
 * return false.
 * 
 * Note: You may assume the string contains only lowercase alphabets.
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
        assertEquals(true, solution.isAnagram(null, null));
        assertEquals(false, solution.isAnagram(null, ""));
        assertEquals(true, solution.isAnagram("anagram", "nagaram"));
        assertEquals(false, solution.isAnagram("rat", "car"));
    }
}
