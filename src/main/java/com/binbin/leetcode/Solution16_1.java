package com.binbin.leetcode;

import java.util.Arrays;

/***
 * 微软面试题：
 * 给定一个数组arr， 可能有正、有负、有0，无序。只能挑选两个数字，想尽量让两个数字加起来的绝对值最小。返回可能的最小的值。
 *
 * 分析：此题和力扣16题近似，最接近的两数之和
 */
public class Solution16_1 {
    public int twoSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int best = Integer.MAX_VALUE;
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                return target;
            }
            if (Math.abs(sum) < Math.abs(best)) {
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
        return best;
    }

    public static void main(String[] args) {
        System.out.println(new Solution16_1().twoSumClosest(new int[]{-1,-2,-3,-1}, 0));
    }
}
