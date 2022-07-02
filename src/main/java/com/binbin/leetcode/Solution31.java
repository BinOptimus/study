package com.binbin.leetcode;

import java.util.Arrays;

public class Solution31 {
    public void nextPermutation(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        for (int i = nums.length - 1; i > 1; --i) {
            int r = i;
            int l = i - 1;
            while (l >= 0) {
                if (nums[l] < nums[r]) {
                    int tmp = nums[l];
                    nums[l] = nums[r];
                    nums[r] = tmp;
                    return;
                }
                --l;
            }
        }
        Arrays.sort(nums);
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, 2};
        new Solution31().nextPermutation(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
