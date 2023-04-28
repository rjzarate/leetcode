/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

https://leetcode.com/problems/remove-nth-node-from-end-of-list/
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int size = 0;
        while (current != null) {
            size ++;
            current = current.next;
        }
        current = head;
        for (int i = 0; i < size - n - 1; i ++) {
            current = current.next;
        }
        if (size == n)
            head = head.next;
        else
            current.next = current.next.next;
        return head;
    }
}
