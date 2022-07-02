package com.binbin.leetcode;

public class Solution6 {
    public static void main(String[] args) {
        System.out.printf(new Solution6().convert("PAYPALISHIRING", 4));
    }

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for (int i = 0; i < numRows; ++i) {
            stringBuilders[i] = new StringBuilder();
        }
        int step = 1;
        int cursor = 0;
        for (int i = 0; i < s.length(); ++i) {
            stringBuilders[cursor].append(s.charAt(i));
            cursor += step;
            if (cursor == 0 || cursor == numRows - 1) {
                step = -step;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; ++i) {
            ans.append(stringBuilders[i]);
        }
        return ans.toString();
    }
}
