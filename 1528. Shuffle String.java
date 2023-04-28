/*
You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

https://leetcode.com/problems/shuffle-string/
*/
class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer,Character> stringPos = new HashMap<Integer,Character>();
        int n = s.length();
        for (int i = 0; i < n; i ++) {
            stringPos.put(indices[i], s.charAt(i));
        }
        String str = "";
        
        for (int i = 0; i < n; i ++) {
            str += stringPos.get(i);
        }
        return str;
    }
}
