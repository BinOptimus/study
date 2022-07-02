package com.binbin.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution169 {
    public int majorityElement(int[] nums) {
        int k = nums.length / 2;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                int count = map.get(num) + 1;
                if (count > k) {
                    return num;
                }
                map.put(num, count);
            } else {
                map.put(num, 1);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution169().majorityElement(new int[]{3,2,3}));
    }
}
