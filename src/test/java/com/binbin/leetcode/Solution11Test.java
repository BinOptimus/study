package com.binbin.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution11Test {

    @Test
    public void maxArea() {
        int ans = new Solution11().maxArea(new int[]{1, 8});
        assertEquals("answer should be 1!", 1, ans);
    }
}