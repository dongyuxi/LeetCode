package com.leetcode.problem141.linkedlistcycle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.ListNode;

/**
 * Given a linked list, determine if it has a cycle in it.
 * 
 * Follow up: Can you solve it without using extra space?
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
    public void testValidInput() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        assertEquals(false, solution.hasCycle(node1));

        node2.next = node1;
        assertEquals(true, solution.hasCycle(node1));
    }
}