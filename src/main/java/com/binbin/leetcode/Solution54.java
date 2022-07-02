package com.binbin.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution54 {
    public List<Integer> spiralOrderWro(int[][] matrix) {
        int[][] dir = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        List<Integer> ans = new ArrayList<>();
        dfs(matrix, 0, 0, dir, ans);
        return ans;
    }

    private void dfs(int[][] matrix, int x, int y, int[][] dir, List<Integer> ans) {
        if (x == -1 || x == matrix.length || y == -1 || y == matrix[0].length || matrix[x][y] == 101) {
            return;
        }
        ans.add(matrix[x][y]);
        matrix[x][y] = 101;
        for (int i = 0; i < dir.length; ++i) {
            int nx = x + dir[i][0];
            int ny = y + dir[i][1];
            dfs(matrix, nx, ny, dir, ans);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(new Solution54().spiralOrder(matrix));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int x = 0;
        int y = 0;
        int[][] dir = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dirIndex = 0;
        int size = matrix.length * matrix[0].length;
        while (ans.size() < size) {
            ans.add(matrix[x][y]);
            matrix[x][y] = 101;
            int nx = x + dir[dirIndex][0];
            int ny = y + dir[dirIndex][1];
            if (nx == -1 || nx == matrix.length || ny == -1 || ny == matrix[0].length || matrix[nx][ny] == 101) {
                dirIndex = (dirIndex + 1) % 4;
            }
            x += dir[dirIndex][0];
            y += dir[dirIndex][1];
        }
        return ans;
    }
}
