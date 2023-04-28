/*
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s and an integer k You want to truncate s such that it contains only the first k words. Return s after truncating it.

https://leetcode.com/problems/truncate-sentence/
*/

class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        String word = "";
        for (int i = 0; i < k; i ++) {
            word += words[i] + " ";
        }
        return word.substring(0, word.length() - 1);
    }
}
