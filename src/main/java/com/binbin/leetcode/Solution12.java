package com.binbin.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution12 {
    public String intToRoman(int num) {
        Map<Integer, String> dictionary = new HashMap<>();
        dictionary.put(1000, "M");
        dictionary.put(900, "CM");
        dictionary.put(500, "D");
        dictionary.put(400, "CD");
        dictionary.put(100, "C");
        dictionary.put(90, "XC");
        dictionary.put(50, "L");
        dictionary.put(40, "XL");
        dictionary.put(10, "X");
        dictionary.put(9, "IX");
        dictionary.put(5, "V");
        dictionary.put(4, "IV");
        dictionary.put(1, "I");
        if (dictionary.get(num) != null) {
            return dictionary.get(num);
        }
        StringBuilder ans = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int e : values) {
            for (int i = 0; i < num / e; ++i) {
                ans.append(dictionary.get(e));
            }
            num = num % e;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution12().intToRoman(4));
    }
}
