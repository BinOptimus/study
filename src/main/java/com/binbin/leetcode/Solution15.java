package com.binbin.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (left > i + 1 && nums[left] == nums[left - 1]) {
                    ++left;
                    continue;
                }
                if (right < nums.length - 1 && nums[right] == nums[right + 1]) {
                    --right;
                    continue;
                }
                int target = 0 - nums[i];
                if (nums[left] + nums[right] == target) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    ++left;
                    --right;
                } else if (nums[left] + nums[right] < target) {
                    ++left;
                } else {
                    --right;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = new Solution15().threeSum(new int[]{-1,0,1,2,-1,-4});
        for (List<Integer> integers : ans) {
            for (Integer i : integers) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
