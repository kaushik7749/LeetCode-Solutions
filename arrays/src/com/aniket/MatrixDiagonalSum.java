//https://leetcode.com/problems/matrix-diagonal-sum/
package com.aniket;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        int ans = computeDiagonalSum(mat);
        System.out.println(ans);
    }
    static int computeDiagonalSum(int[][] mat) {
        int diagSum = 0;
        for(int row = 0; row < mat.length; row++) {
            diagSum += mat[row][row] + mat[row][mat.length - row - 1];
        }
        if(mat.length % 2 != 0) {
            diagSum -= mat[mat.length / 2][mat.length / 2];
        }
        return diagSum;
    }
}
