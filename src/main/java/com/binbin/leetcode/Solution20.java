package com.binbin.leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution20 {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); ++i) {
            if (!map.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (stack.isEmpty() || !stack.peek().equals(map.get(s.charAt(i)))) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
