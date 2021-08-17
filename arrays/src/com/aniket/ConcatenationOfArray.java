//https://leetcode.com/problems/concatenation-of-array/
package com.aniket;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] ans = concatenateArr(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(ans));
    }
    static int[] concatenateArr(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0; i<nums.length; i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
