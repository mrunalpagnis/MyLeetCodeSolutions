package algorithms;

import datastructures.ListNode;

/**
 * https://leetcode.com/problems/add-two-numbers/
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode sumPrev = new ListNode(0);
        sumPrev.next = null;
        ListNode sum = sumPrev;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int currSum = carry;
            if (l1 != null) {
                currSum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                currSum += l2.val;
                l2 = l2.next;
            }
            carry = currSum / 10;
            ListNode currSumNode = new ListNode(currSum % 10);
            currSumNode.next = null;
            sumPrev.next = currSumNode;
            sumPrev = sumPrev.next;
        }

        return sum.next;
    }
}