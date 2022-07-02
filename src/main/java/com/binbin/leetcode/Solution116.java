package com.binbin.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution116 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Queue<Node> nodeQueue = new ArrayDeque<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();
            Node prev = null;
            for (int i = 0; i < size; ++i) {
                Node node = nodeQueue.poll();
                if (prev != null) {
                    prev.next = node;
                }
                prev = node;
                if (node.left != null) {
                    nodeQueue.offer(node.left);
                }
                if (node.right != null) {
                    nodeQueue.offer(node.right);
                }
            }
        }
        return root;
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
