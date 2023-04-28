/*
Given a string s, return the longest palindromic substring in s.

https://leetcode.com/problems/longest-palindromic-substring/
*/

class Solution {
    public String longestPalindrome(String s) {
        String[] array = s.split("");
        int n = array.length;
        String longest = array[0];
        String current = "";

        for (int i = 0; i < n; i ++) {
            //odd
            current = array[i];
            for (int j = 1; j <= i; j ++) {
                if (i + j >= n)
                    break;
                if (array[i - j].equals(array[i + j]))
                    current = array[i - j] + current + array[i + j];
                else
                    break;
                longest = (current.length() > longest.length()) ? current : longest;
            }

            
            //even
            current = "";
            if (i + 1 >= n) {
                //empty
            } else if (!(array[i].equals(array[i + 1]))) {
                //empty
            } else {
                for (int j = 0; j <= i; j ++) {
                if (i + j + 1 >= n)
                    break;
                if (array[i - j].equals(array[i + j + 1]))
                    current = array[i - j] + current + array[i + j + 1];
                else
                    break;
                longest = (current.length() > longest.length()) ? current : longest;
                }
            }
        }
        return longest;
    }
}
