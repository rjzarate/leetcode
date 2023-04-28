/*
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
*/

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "";
        String b = "";
        for (String word: word1) {
            a += word;
        }
        for (String word: word2) {
            b += word;
        }
        return a.equals(b);
    }
}
