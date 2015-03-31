package com.leetcode.problem025.reversenodesinkgroup;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.ListNode;

/**
 * Given a linked list, reverse the nodes of a linked list k at a time and
 * return its modified list.
 * 
 * If the number of nodes is not a multiple of k then left-out nodes in the end
 * should remain as it is.
 * 
 * You may not alter the values in the nodes, only nodes itself may be changed.
 * 
 * Only constant memory is allowed.
 * 
 * For example, Given this linked list: 1->2->3->4->5
 * 
 * For k = 2, you should return: 2->1->4->3->5
 * 
 * For k = 3, you should return: 3->2->1->4->5
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

        ListNode node5 = new ListNode(5);
        temp.next = node5;
        temp = temp.next;

        ListNode node6 = new ListNode(6);
        temp.next = node6;
        temp = temp.next;

        ListNode node7 = new ListNode(7);
        temp.next = node7;
        temp = temp.next;

        ListNode reversedHead = solution.reverseKGroup(head, 2);
        reversedHead.show();
    }
}