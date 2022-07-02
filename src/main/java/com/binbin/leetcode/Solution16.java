package com.binbin.leetcode;

import java.util.Arrays;

public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int best = 10000;
        for (int i = 0; i < nums.length; ++i) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target) {
                    return target;
                }
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }

                if (sum < target) {
                    int l0 = l + 1;
                    while (l0 < r && nums[l0] == nums[l0 - 1]) {
                        ++l0;
                    }
                    l = l0;
                } else {
                    int r0 = r - 1;
                    while (l < r0 && nums[r0] == nums[r0 + 1]) {
                        --r0;
                    }
                    r = r0;
                }
            }
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(new Solution16().threeSumClosest(new int[]{0,0,0}, 1));
    }
}
