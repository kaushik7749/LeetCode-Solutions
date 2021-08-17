//https://leetcode.com/problems/find-the-highest-altitude/
package com.aniket;

public class FindHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int ans = findHighestAltitude(gain);
        System.out.println(ans);
    }
    static int findHighestAltitude(int[] gain) {
        int currAlt = 0;
        int maxAlt = 0;
        for(int altGain : gain) {
            currAlt += altGain;
            maxAlt = Math.max(maxAlt , currAlt);
        }
        return maxAlt;
    }
}
