package com.binbin.leetcode;

public class Solution45 {
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int cur = 0;
        int count = 0;
        while (cur < nums.length - 1) {
            if (cur + nums[cur] >= nums.length - 1) {
                ++count;
                break;
            }
            cur = func(nums, cur + 1, cur + nums[cur]);
            ++count;
        }
        return count;
    }

    private int func(int[] nums, int start, int end) {
        if (end > nums.length - 1) {
            end = nums.length - 1;
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = end; i >= start; --i) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(new Solution45().jump(new int[]{10,1,1,5,1}));
    }
}
