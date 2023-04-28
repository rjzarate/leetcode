/*
Given a string s, find the length of the longest substring without repeating characters.

https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
*/
import java.util.Set;
import java.util.Arrays;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        String[] strList = s.split("");
        if (s.equals(""))
            return 0;
        Set<String> charactersSet = new HashSet<String>();
        int count = 0;
        int temp = 0;



        for (int i = 0; i < strList.length; i ++)
        {
            temp = 1;
            charactersSet = new HashSet<String>();
            charactersSet.add(strList[i]);

            for (int j = i + 1; j < strList.length; j ++)
            {
                if (charactersSet.contains(strList[j]))
                {
                    break;
                } else
                {
                    charactersSet.add(strList[j]);
                    temp ++;
                }
                
            }


            count = (temp > count) ? temp : count;

        }


        return count;
    }
}
