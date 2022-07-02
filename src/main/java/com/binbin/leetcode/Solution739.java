package com.binbin.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = temperatures.length - 1; i >=0; --i) {
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans = new Solution739().func4(new int[]{5,2,1,6,2,3});
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    // 找到左边第一个比当前位置小的元素坐标
    public int[] func1(int[] array) {
        int ans[] = new int[array.length];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < array.length; ++i) {
            while (!stack.isEmpty() && array[stack.peek()] >= array[i]) { //找到第一个栈顶元素，比当前位置小
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return ans;
    }

    // 找到左边第一个比当前位置大的元素坐标
    public int[] func2(int[] array) {
        int ans[] = new int[array.length];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < array.length; ++i) {
            while (!stack.isEmpty() && array[stack.peek()] <= array[i]) { //找到第一个栈顶元素，比当前位置大
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return ans;
    }

    // 找到右边第一个比当前位置小的元素坐标
    public int[] func3(int[] array) {
        int ans[] = new int[array.length];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = array.length - 1; i >= 0; --i) {
            while (!stack.isEmpty() && array[stack.peek()] >= array[i]) { //找到第一个栈顶元素，比当前位置小
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return ans;
    }

    // 找到右边第一个比当前位置大的元素坐标
    public int[] func4(int[] array) {
        int ans[] = new int[array.length];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = array.length - 1; i >= 0; --i) {
            while (!stack.isEmpty() && array[stack.peek()] <= array[i]) { //找到第一个栈顶元素，比当前位置小
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return ans;
    }
}
