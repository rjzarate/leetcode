/*
Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.

https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
*/

class Solution {
    public String firstPalindrome(String[] words) {
        for (String word: words) {
            boolean foundWord = true;
            for (int i = 0; i < word.length() / 2; i ++) {
                if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                    foundWord = false;
                    break;
                }
            }
            if (foundWord)
                return word;
        }
        return "";
    }
}
