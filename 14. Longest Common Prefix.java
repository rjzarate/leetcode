/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

https://leetcode.com/problems/longest-common-prefix/
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String p = "";
        int n = strs.length;
        int l = 200;
        if (n == 0)
            return p;
        
        for (int i = 0; i < n; i ++) {
            l = Math.min(l, strs[0].length());
            if (strs[0].charAt(0) != strs[i].charAt(0))
                return p;
        }

        for (int i = 1; i < l; i ++) {
            for (int j = 1; j < n; j ++) {
                if (strs[0].charAt(i) != strs[j].charAt(i))
                    break;
            }
            p = p + strs[0].charAt(i);

        }
        return p;
    }
}
