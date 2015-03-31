package com.leetcode.problem083.removeduplicatesfromsortedlist;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.problem.utils.ListNode;

/**
 * Given a sorted linked list, delete all duplicates such that each element
 * appear only once.
 * 
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
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
        ListNode node1 = new ListNode(1);
        head.next = node1;
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        showList(solution.deleteDuplicates(head));
    }

    @Test
    public void testWrongAnswer() {
        ListNode head = new ListNode(1);
        showList(solution.deleteDuplicates(head));
    }

    @Test
    public void testWrongAnswer2() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        head.next = node1;
        showList(solution.deleteDuplicates(head));
    }

    @Test
    public void testWrongAnswer3() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        showList(solution.deleteDuplicates(head));
    }

    private void showList(ListNode head) {
        ListNode tmpHead = head;
        while (null != tmpHead) {
            System.out.print(tmpHead.val + " ");
            tmpHead = tmpHead.next;
        }
        System.out.println();
    }
}