package com.binbin.leetcode;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        int slow = 0;
        int fast = 1;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                nums[slow + 1] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow + 1;
    }
}
