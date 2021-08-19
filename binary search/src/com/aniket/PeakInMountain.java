//https://leetcode.com/problems/peak-index-in-a-mountain-array/
package com.aniket;

public class PeakInMountain {
    public static void main(String[] args) {
        int[] mountain = {24,69,100,99,79,78,67,36,26,19};
        int ans = findPeakInMountain(mountain);
        System.out.println(ans);
    }
    static int findPeakInMountain(int[] arr) {
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
