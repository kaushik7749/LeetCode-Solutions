//https://leetcode.com/problems/shuffle-the-array/
package com.aniket;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int[] ans = shuffleArr(nums,4);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(ans));
    }
    static int[] shuffleArr(int[] arr, int n) {
        int[] ans = new int[arr.length];
        for(int i=0; i<n; i++) {
            ans[2*i] = arr[i];
            ans[2*i+1] = arr[n+i];
        }
        return ans;
    }
}
