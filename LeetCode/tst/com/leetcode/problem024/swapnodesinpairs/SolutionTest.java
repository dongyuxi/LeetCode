package com.leetcode.problem024.swapnodesinpairs;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.ListNode;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * 
 * For example, Given 1->2->3->4, you should return the list as 2->1->4->3.
 * 
 * Your algorithm should use only constant space. You may not modify the values
 * in the list, only nodes itself can be changed.
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
        ListNode head = new ListNode(1);
        ListNode temp = head;

        ListNode node2 = new ListNode(2);
        temp.next = node2;
        temp = temp.next;

        ListNode node3 = new ListNode(3);
        temp.next = node3;
        temp = temp.next;

        ListNode node4 = new ListNode(4);
        temp.next = node4;
        temp = temp.next;

        ListNode reversedHead = solution.swapPairs(head);
        temp = reversedHead;
        while (null != temp) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}