//https://leetcode.com/problems/running-sum-of-1d-array/
package com.aniket;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] runningSum = runningSumOfArr(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(runningSum));
    }
    static int[] runningSumOfArr(int[] nums) {
        int[] rSum = new int[nums.length];
        //Approach 1
//        for(int i=0; i<nums.length; i++) {
//            int sum = 0;
//            for(int j=0; j<=i; j++) {
//                sum += nums[j];
//            }
//            rSum[i] = sum;
//        }
        //Approach 2
        rSum[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            rSum[i] = nums[i] + rSum[i-1];
        }
        return rSum;
    }
}
