//https://leetcode.com/problems/find-peak-element/
package com.aniket;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int ans = findPeak(nums);
        System.out.println(ans);
    }
    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length -1 ;
        while(start < end) {
            //find mid
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                //we are in the decreasing part of the array
                //mid can be an ans but more ans may lie in the left
                end = mid;
            }
            else{
                //we are in the increasing part of the array
                //big numbers lie on the right side
                start = mid + 1;
            }
        }
        //ans found when start == mid
        return start;
    }
}
