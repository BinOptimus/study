package com.binbin.leetcode;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = nums1.length - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[p--] = nums1[p1];
                p1--;
            } else {
                nums1[p--] = nums2[p2];
                p2--;
            }
        }
        if (p1 >= 0) {
            while (p1 >= 0) {
                nums1[p--] = nums1[p1];
                p1--;
            }
        } else {
            while (p2 >= 0) {
                nums1[p--] = nums1[p2];
                p2--;
            }
        }
    }
}
