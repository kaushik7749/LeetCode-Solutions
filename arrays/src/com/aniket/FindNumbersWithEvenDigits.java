//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
package com.aniket;

import java.util.Arrays;

public class FindNumbersWithEvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = findNums(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(ans);
    }
    //find the number of numbers having even digits in an array
    static int findNums(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if(hasEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }
    //count the number of digits and return true if number of digits is even
    static boolean hasEvenDigits(int n) {
        int digits = 0;
        while(n > 0) {
            digits++;
            n = n/10;
        }
        return digits%2 == 0;
    }
}
