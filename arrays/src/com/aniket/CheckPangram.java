//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
package com.aniket;

public class CheckPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkPangram(sentence));
    }
    static boolean checkPangram(String sentence) {
        //array to store the occurrence of every alphabet in sentence
        boolean[] occ = new boolean[26];
        //iterate over the sentence and store frequency of every alphabet in freq
        for(char ch : sentence.toCharArray()) {
            occ[ch - 97] = true;
        }
         //return false if any letter does not occur in the sentence
        //else return true
        //iterate over the freq array to check the occurrence of every alphabet
        for(boolean idx : occ) {
            if(!idx) {
                return false;
            }
        }
        return true;
    }
}
