package com.binbin.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //int[][] intervals = {{1, 18}, {2, 6}, {8, 10}, {15, 18}};
        int[][] intervals = {{1, 4}, {4, 5}, {15, 18}, {8, 10}};
        int[][] ans = new Solution().merge(intervals);
        System.out.printf("Hello world!");
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (left, right) -> left[0] - right[0]);
        List<int[]> res = new ArrayList<>();
        int min = intervals[0][0];
        int max = intervals[0][1];
        for (int i = 1; i < intervals.length; ++i) {
            if (max < intervals[i][0]) {
                res.add(new int[]{min, max});
                min = intervals[i][0];
                max = intervals[i][1];
            } else {
                max = Math.max(max, intervals[i][1]);
            }
        }
        res.add(new int[]{min, max});

        int[][] ans = new int[res.size()][];
        for (int i = 0; i < res.size(); ++i) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}
