package com.leetcode.problem030.substringwithconcatenationofallwords;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * You are given a string, s, and a list of words, words, that are all of the
 * same length. Find all starting indices of substring(s) in s that is a
 * concatenation of each word in words exactly once and without any intervening
 * characters.
 * 
 * For example, given: s: "barfoothefoobarman" words: ["foo", "bar"]
 * 
 * You should return the indices: [0,9]. (order does not matter).
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
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(0);
        expected.add(9);
        assertEquals(expected, solution.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
    }
}