package com.leetcode.problem093.restoreipaddresses;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.Utils;

/**
 * Given a string containing only digits, restore it by returning all possible
 * valid IP address combinations.
 * 
 * For example: Given "25525511135",
 * 
 * return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
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
        Utils.showList(solution.restoreIpAddresses("25525511135"));
    }

    @Test
    public void testWrongAnswer() {
        Utils.showList(solution.restoreIpAddresses("0000"));
    }

    @Test
    public void testWrongAnswer2() {
        Utils.showList(solution.restoreIpAddresses("010010"));
    }
}