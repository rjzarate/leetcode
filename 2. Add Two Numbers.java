/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
https://leetcode.com/problems/add-two-numbers/
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode addedNumbers = new ListNode(0);
        ListNode current = addedNumbers;
        int carry = 0;
        while (l1 != null && l2 != null)
        {
            current.next = new ListNode(l1.val + l2.val + carry);
            current.next = current;
            addedNumbers.next = current;
            carry = (l1.val + l2.val) % 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        return addedNumbers.next;
    }
}
