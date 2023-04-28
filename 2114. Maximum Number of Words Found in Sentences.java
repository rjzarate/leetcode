/*
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.

https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
*/
class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int mostWords = 0;
        int words = 0;
        String s = "";
        for (String sentence: sentences) {
            s = sentence.replaceAll("[^ ]", "");
            mostWords = (s.length() + 1 > mostWords) ? s.length() + 1 : mostWords;
        }
        return mostWords;
    }
}
