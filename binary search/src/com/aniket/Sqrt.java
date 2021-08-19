//https://leetcode.com/problems/sqrtx/
package com.aniket;

public class Sqrt {
    public static void main(String[] args) {
        int x = 9;
        int ans = mysqrt(x);
        System.out.println(ans);
    }
    static int mysqrt(int x) {
        int start = 0;
        int end = x;

        if(x == 0 || x == 1) {
            return x;
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid <= x / mid) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return end;
    }
}
