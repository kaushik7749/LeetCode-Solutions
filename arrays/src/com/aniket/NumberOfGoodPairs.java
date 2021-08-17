//https://leetcode.com/problems/number-of-good-pairs/
package com.aniket;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        int ans = numGoodPairs2(nums);
        System.out.println(ans);
    }
    //check for the occurence of the element at an index  i in the range [i+1, nums.length]
    //if found increase count by 1
    static int numGoodPairs(int[] arr) {
        int goodPairs = 0;
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }
    //find the frequency of every array element and store in a separate array
    //compute the number of pairs using the nCr formula where nC2 = n*(n-1)/2
    static int numGoodPairs2(int[] arr) {
        int[] freq = new int[101];
        for(int ele : arr) {
            freq[ele]++;
        }
        int ans = 0;
        for(int ele : freq) {
            ans += ele * (ele-1) / 2;
        }
        return ans;
    }
}
