package com.leetcode.problem160.intersectionoftwolinkedlists;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.ListNode;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * 
 * For example, the following two linked lists:
 * 
 * A:          a1 ¡ú a2
 *                      c1 ¡ú c2 ¡ú c3
 * B:     b1 ¡ú b2 ¡ú b3
 * begin to intersect at node c1.
 * Notes:
 *   If the two linked lists have no intersection at all, return null.
 *   The linked lists must retain their original structure after the function returns.
 *   You may assume there are no cycles anywhere in the entire linked structure.
 *   Your code should preferably run in O(n) time and use only O(1) memory.
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
    public void testNullInput() {
        assertEquals(null, solution.getIntersectionNode(null, null));
    }

    @Test
    public void testHeadAIsLonger() {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode b1 = new ListNode(1);
        ListNode c1 = new ListNode(3);
        a1.next = a2; a2.next = c1;
        b1.next = c1;
        assertEquals(c1, solution.getIntersectionNode(a1, b1));
    }

    @Test
    public void testHeadBIsLonger() {
        ListNode a1 = new ListNode(1);
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(2);
        ListNode c1 = new ListNode(3);
        a1.next = c1;
        b1.next = b2; b2.next = c1;
        assertEquals(c1, solution.getIntersectionNode(a1, b1));
    }

    @Test
    public void testLengthIsEqaul() {
        ListNode a1 = new ListNode(1);
        ListNode b1 = new ListNode(1);
        ListNode c1 = new ListNode(3);
        a1.next = c1;
        b1.next = c1;
        assertEquals(c1, solution.getIntersectionNode(a1, b1));
    }

    @Test
    public void testNoIntersection() {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(2);
        a1.next = a2;
        b1.next = b2;
        assertEquals(null, solution.getIntersectionNode(a1, b1));
    }
}