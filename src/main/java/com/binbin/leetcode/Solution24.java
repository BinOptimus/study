package com.binbin.leetcode;

public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p1 = head;
        ListNode p2 = head.next;
        while (p1 != null && p2 != null) {
            int tmp = p1.val;
            p1.val = p2.val;
            p2.val = tmp;
            p1 = p2.next;
            p2 = p1 == null ? null : p1.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
