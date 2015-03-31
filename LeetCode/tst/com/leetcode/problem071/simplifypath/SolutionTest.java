package com.leetcode.problem071.simplifypath;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Given an absolute path for a file (Unix-style), simplify it.
 * 
 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 * 
 * Corner Cases: Did you consider the case where path = "/../"? In this case,
 * you should return "/". Another corner case is the path might contain multiple
 * slashes '/' together, such as "/home//foo/". In this case, you should ignore
 * redundant slashes and return "/home/foo".
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
        assertEquals("/", solution.simplifyPath(null));
        assertEquals("/", solution.simplifyPath(""));
        assertEquals("/", solution.simplifyPath("/"));
        assertEquals("/", solution.simplifyPath("/./"));
        assertEquals("/", solution.simplifyPath("/../"));

        assertEquals("/home", solution.simplifyPath("/home/"));
        assertEquals("/home/dongyuxi", solution.simplifyPath("/home/dongyuxi/"));
        assertEquals("/c", solution.simplifyPath("/a/./b/../../c/"));
    }

    @Test
    public void testWrongAnswer() {
        assertEquals("/", solution.simplifyPath("///"));
        assertEquals("/e/f/g", solution.simplifyPath("/a/./b///../c/../././../d/..//../e/./f/./g/././//.//h///././/..///"));
    }
}