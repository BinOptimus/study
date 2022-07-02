package com.binbin.leetcode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Solution264 {
    public int nthUglyNumber(int n) {
        int[] factors = new int[]{2, 3, 5};
        Queue<Long> queue = new PriorityQueue<>();
        queue.add(1L);
        Set<Long> set = new HashSet<>();
        set.add(1L);
        long ugly = 1;
        for (int i = 0; i < n; ++i) {
            ugly = queue.poll();
            for (int factor : factors) {
                long l = ugly * factor;
                if (set.add(l)) {
                    queue.offer(l);
                }
            }
        }
        return (int) ugly;
    }
}
