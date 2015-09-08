package com.leetcode.problem278.firstbadversion;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * You are a product manager and currently leading a team to develop a new
 * product. Unfortunately, the latest version of your product fails the quality
 * check. Since each version is developed based on the previous version, all the
 * versions after a bad version are also bad.
 * 
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first
 * bad one, which causes all the following ones to be bad.
 * 
 * You are given an API bool isBadVersion(version) which will return whether
 * version is bad. Implement a function to find the first bad version. You
 * should minimize the number of calls to the API.
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
    public void test0() {
        List<Boolean> versions = new ArrayList<Boolean>();
        versions.add(true);
        solution.setVersions(versions);
        assertEquals(1, solution.firstBadVersion(1));
    }

    @Test
    public void test1() {
        List<Boolean> versions = new ArrayList<Boolean>();
        versions.add(false);
        versions.add(true);
        solution.setVersions(versions);
        assertEquals(2, solution.firstBadVersion(2));
    }

    @Test
    public void test2() {
        List<Boolean> versions = new ArrayList<Boolean>();
        versions.add(false);
        versions.add(false);
        versions.add(true);
        solution.setVersions(versions);
        assertEquals(3, solution.firstBadVersion(3));
    }

    @Test
    public void test3() {
        List<Boolean> versions = new ArrayList<Boolean>();
        versions.add(false);
        versions.add(true);
        versions.add(true);
        solution.setVersions(versions);
        assertEquals(1, solution.firstBadVersion(1));
    }
}