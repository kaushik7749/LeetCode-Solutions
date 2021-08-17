//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
package com.aniket;

public class CellsWithOddValuesInMatrix {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {
            {0,1},
            {1,1}
        };
        int ans = cellsWithOddValues(m,n,indices);
        System.out.println(ans);
    }
    static int cellsWithOddValues(int m, int n, int[][] indices) {
        int[][] res = new int[m][n];
        for(int[] idx : indices) {
            incr(res, idx[0], idx[1]);
        }
        int ans = 0;
        for(int row = 0; row < m ; row++) {
            for(int col = 0; col < n; col++) {
                if(res[row][col] % 2 != 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
    static void incr(int[][] ans, int rowIdx, int colIdx) {
        for(int col = 0; col < ans[rowIdx].length ; col++) {
            ans[rowIdx][col]++;
        }
        for(int row = 0; row < ans.length; row++) {
            ans[row][colIdx]++;
        }
    }
}
