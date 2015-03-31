package com.leetcode.problem049.anagrams;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.Utils;

/**
 * Given an array of strings, return all groups of strings that are anagrams.
 * 
 * Note: All inputs will be in lower-case.
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
        Utils.showList(solution.anagrams(new String[]{"eat", "tea", "ate", "a"}));
    }

    @Test
    public void testWrongAnswer() {
        Utils.showList(solution.anagrams(new String[]{"", "", ""}));
    }
}