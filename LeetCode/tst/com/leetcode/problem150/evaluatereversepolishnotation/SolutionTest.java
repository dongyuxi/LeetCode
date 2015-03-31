package com.leetcode.problem150.evaluatereversepolishnotation;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

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
public class SolutionTest {
    public Solution solution = null;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void test() {
        String[] array = new String[]{"2", "1", "+", "3", "*"};
        assertEquals(9, solution.evalRPN(array));

        array = new String[]{"4", "13", "5", "/", "+"};
        assertEquals(6, solution.evalRPN(array));
    }
}