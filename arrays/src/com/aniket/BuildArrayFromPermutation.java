//https://leetcode.com/problems/build-array-from-permutation/
package com.aniket;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        int[] ans = buildArr(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(ans));
    }
    static int[] buildArr(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
