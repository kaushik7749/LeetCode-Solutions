//https://leetcode.com/problems/create-target-array-in-the-given-order/
package com.aniket;

import java.util.Arrays;
import java.util.ArrayList;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] target = createTargetArray(nums,index);
        System.out.println(Arrays.toString(target));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        // add each element of nums at list[index[i]]
        for(int i = 0; i < index.length; i++) {
            list.add(index[i] , nums[i]);
        }
        //copy the elements of the ArrayList into an array and return it
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
