/*
Given a list of strings words and a string pattern, return a list of words[i] that match pattern. You may return the answer in any order.

A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.

Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.

https://leetcode.com/problems/find-and-replace-pattern/description/
*/

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> patterns = new ArrayList<String>();
        HashMap<Character, Character> replacement = new HashMap<Character, Character>();
        String newPattern = "";
        char ch = 'A';
        for (int i = 0; i < pattern.length(); i ++) {
            if (replacement.containsKey(pattern.charAt(i))) {
                newPattern += replacement.get(pattern.charAt(i));
            } else {
                replacement.put(pattern.charAt(i), ch);
                newPattern += ch;
                ch ++;
            }
        }
        System.out.println(newPattern);
        for (String word: words) {
            replacement.clear();
            ch = 'A';
            String newWord = "";

            for (int i = 0; i < word.length(); i ++) {
                if (replacement.containsKey(word.charAt(i))) {
                    newWord += replacement.get(word.charAt(i));
                } else {
                    replacement.put(word.charAt(i), ch);
                    newWord += ch;
                    ch ++;
                }
            }
            if (newWord.equals(newPattern))
                patterns.add(word);
        }
        return patterns;
    }
}
