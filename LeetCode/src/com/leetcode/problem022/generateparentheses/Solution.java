package com.leetcode.problem022.generateparentheses;

import java.util.ArrayList;
import java.util.List;

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
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        String str = "";
        generate(list, str, n, n);
        return list;
    }

    private void generate(List<String> list, String str, int left, int right) {
        if (0 == left && 0 == right) {
            list.add(str);
            return;
        }

        if (left > 0) {
            generate(list, str + "(", left - 1, right);
        }

        if (left < right) {
            generate(list, str + ")", left, right - 1);
        }
    }

}