//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
package com.aniket;

import java.util.Arrays;

public class NumsSmallerThanCurrNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = findAns(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(ans));
    }
    static int[] findAns(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            int count = 0;
            for(int j=0; j<arr.length; j++) {
                if(i!=j && arr[j]<arr[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
