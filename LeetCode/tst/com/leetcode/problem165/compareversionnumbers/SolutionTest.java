package com.leetcode.problem165.compareversionnumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Compare two version numbers version1 and version2. If version1 > version2
 * return 1, if version1 < version2 return -1, otherwise return 0.
 * 
 * You may assume that the version strings are non-empty and contain only digits
 * and the . character. The . character does not represent a decimal point and
 * is used to separate number sequences. For instance, 2.5 is not
 * "two and a half" or "half way to version three", it is the fifth second-level
 * revision of the second first-level revision.
 * 
 * Here is an example of version numbers ordering:
 * 
 * 0.1 < 1.1 < 1.2 < 13.37
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
        assertEquals(-1, solution.compareVersion("0.1", "1.1"));
        assertEquals(-1, solution.compareVersion("1.1", "1.2"));
        assertEquals(-1, solution.compareVersion("1.2", "13.37"));

        assertEquals(0, solution.compareVersion("1", "1.0"));
    }
}