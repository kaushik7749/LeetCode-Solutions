//https://leetcode.com/problems/flipping-an-image/
package com.aniket;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        int[][] ans = flipImage(image);
        for(int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }
    // copy each row of image in reverse order (flip) and subtract it with 1 (invert) and store it in res
    static int[][] flipImage(int[][] image) {
        int[][] res = new int[image.length][image.length];
        for(int row = 0; row < image.length; row++) {
            for(int col = 0; col < image.length; col++) {
                res[row][col] = 1- image[row][image.length - col - 1];
            }
        }
        return res;
    }
}
