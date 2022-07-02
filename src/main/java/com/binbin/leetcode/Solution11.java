package com.binbin.leetcode;

public class Solution11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = Integer.MIN_VALUE;
        while (left < right) {
            max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
                right--;
            } else {
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1, 8};
        System.out.println(new Solution11().maxArea(height));
    }
}
