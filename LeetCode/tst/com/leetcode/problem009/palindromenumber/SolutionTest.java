package com.leetcode.problem009.palindromenumber;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 
 * Could negative integers be palindromes? (ie, -1)
 * 
 * If you are thinking of converting the integer to string, note the restriction
 * of using extra space.
 * 
 * You could also try reversing an integer. However, if you have solved the
 * problem "Reverse Integer", you know that the reversed integer might overflow.
 * How would you handle such case?
 * 
 * There is a more generic way of solving this problem.
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
    public void testStringEmpty() {
        assertEquals(true, solution.isPalindrome(1001));
        assertEquals(false, solution.isPalindrome(1000));
    }
}