package com.binbin.leetcode;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode pos = null;
        int tmp = 0;

        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = tmp + val1 + val2;
            int val = sum % 10;
            tmp = sum / 10;
            ListNode node = new ListNode(val);

            if (head == null) {
                head = node;
            } else {
                pos.next = node;
            }
            pos = node;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (tmp != 0) {
            pos.next = new ListNode(tmp);
        }
        return head;
    }
}
