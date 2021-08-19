//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package com.aniket;

import java.util.Arrays;

public class FirstAndLastInSorted {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        int[] pos = findOcc(nums,target);
        System.out.println(Arrays.toString(pos));
    }
    static int[] findOcc(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = binarySearch(nums,target,true);
        if(ans[0] == -1) {
            return ans;
        }
        ans[1] = binarySearch(nums,target,false);
        return ans;
    }
    static int binarySearch(int[] arr, int target, boolean findFirstIdx) {
        int start = 0;
        int end = arr.length - 1;
        int ans =  -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                ans = mid;
                if(findFirstIdx) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
