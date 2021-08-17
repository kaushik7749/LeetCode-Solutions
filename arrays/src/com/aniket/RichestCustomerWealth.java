//https://leetcode.com/problems/richest-customer-wealth/
package com.aniket;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1},
        };
        int ans = findMaxWealth(accounts);
        System.out.println(ans);
    }
    static int findMaxWealth(int[][] arr) {
        int maxWealth = Integer.MIN_VALUE;
        for(int[] row : arr) {
            int rowSum = computeSum(row);
            maxWealth = Math.max(maxWealth,rowSum);
        }
        return maxWealth;
    }
    static int computeSum(int[] arr) {
        int sum = 0;
        for(int ele : arr) {
            sum += ele;
        }
        return sum;
    }
}
