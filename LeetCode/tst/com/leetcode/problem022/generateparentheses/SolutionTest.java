package com.leetcode.problem022.generateparentheses;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Given n pairs of parentheses, write a function to generate all combinations
 * of well-formed parentheses.
 * 
 * For example, given n = 3, a solution set is:
 * 
 * "((()))", "(()())", "(())()", "()(())", "()()()"
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
        List<String> list = new ArrayList<String>();
        list.add("((()))");
        list.add("(()())");
        list.add("(())()");
        list.add("()(())");
        list.add("()()()");
        assertEquals(list, solution.generateParenthesis(3));
    }
}