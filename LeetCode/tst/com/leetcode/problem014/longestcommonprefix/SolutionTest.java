package com.leetcode.problem014.longestcommonprefix;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem014.longestcommonprefix.Solution;

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
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
        String[] strs = new String[]{"abcd", "ab", "abde"};
        String result = solution.longestCommonPrefix(strs);
        System.out.println(result);

        strs = new String[]{};
        result = solution.longestCommonPrefix(strs);
        System.out.println(result);
    }
}
