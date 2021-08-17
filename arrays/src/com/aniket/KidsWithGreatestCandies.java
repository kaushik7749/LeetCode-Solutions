//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
package com.aniket;

import java.util.ArrayList;
import java.util.Arrays;

public class KidsWithGreatestCandies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        ArrayList<Boolean> ans = kidsWithCandies(candies,extraCandies);
        System.out.println(ans);
    }

    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = findMax(candies);
        ArrayList<Boolean> result = new ArrayList<>();
        for(int kid : candies) {
            result.add(kid+ extraCandies >= maxCandies);
        }
        return result;
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int ele : arr) {
            max = Math.max(max,ele);
        }
        return max;
    }

}
