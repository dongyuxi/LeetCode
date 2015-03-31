package com.leetcode.problem020.validparentheses;

import java.util.Stack;

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
public class Solution {
    public boolean isValid(String s) {
        if (null == s || 0 == s.length() || 0 != s.length() % 2) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                char top = stack.peek();
                if ((top == '(' && s.charAt(i) == ')')
                        || (top == '{' && s.charAt(i) == '}')
                        || (top == '[' && s.charAt(i) == ']')) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }
}