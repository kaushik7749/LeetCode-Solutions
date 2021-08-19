//https://leetcode.com/problems/find-in-mountain-array/
package com.aniket;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] mountain = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = searchInMountain(mountain,target);
        System.out.println(ans);
    }
    static int searchInMountain(int[] arr, int target) {
        int peakIdx = findPeak(arr);
        int idx = orderAgnosticBS(arr,target,0, peakIdx);
        if(idx == -1) {
            return orderAgnosticBS(arr,target,peakIdx + 1, arr.length - 1);
        }
        return idx;
    }
    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(arr[mid] < target) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
