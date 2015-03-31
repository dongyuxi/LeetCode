package com.leetcode.problem150.evaluatereversepolishnotation;

import java.util.Stack;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * 
 * Valid operators are +, -, *, /. Each operand may be an integer or another
 * expression.
 * 
 * Some examples:
 * 
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 * 
 * 
 * @author dongyuxi
 *
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            if (!isOperator(tokens[i])) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int num = operator(num1, num2, tokens[i]);
                stack.push(num);
            }
        }
        return stack.peek();
    }

    private int operator(int num1, int num2, String str) {
        int result = 0;
        switch(str) {
        case "+":
            result = num1 + num2;
            break;
        case "-":
            result = num1 - num2;
            break;
        case "*":
            result = num1 * num2;
            break;
        case "/":
            result = num1 / num2;
            break;
        default:
            break;
        }
        return result;
    }

    private boolean isOperator(String str) {
        return "+".equals(str) || "-".equals(str)
                || "*".equals(str) || "/".equals(str);
    }
}