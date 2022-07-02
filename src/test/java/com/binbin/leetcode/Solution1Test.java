package com.binbin.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1Test {
    @Test
    public void testTwoSum() {
        int[] ans = new Solution1().twoSum(new int[]{2, 7, 11, 5}, 9);
        assertEquals(0, ans[0]);
        assertEquals(1, ans[1]);
    }
}