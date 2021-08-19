package com.aniket;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = findFloor(nums,target);
        System.out.println(ans);
    }
    static int findFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return arr[mid];
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
