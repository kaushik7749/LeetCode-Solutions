//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
package com.aniket;

public class TwoSum2 {
    public static void main(String[] args) {
        
    }
    /*
    Approach 1
    static int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++) {
            // assume the ith element in the ans
            // search for the target - ith element in the array
            // if found return [i + 1 , idx + 1]
            // else discard the ith element and move onto the next one
            int searchItem = target - numbers[i];
            // if the searchItem is less than the max element (right most)
            // only then it exists in the array or else not
            if(searchItem <= numbers[numbers.length - 1]) {
                int idx = binarySearch(numbers, searchItem, i + 1, numbers.length - 1);
                if(idx != -1){
                    return new int[]{i + 1, idx + 1};
                }
            }
        }
        // no answer found
        return new int[]{-1,-1};
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
     */

}
