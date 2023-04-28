/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

https://leetcode.com/problems/valid-parentheses/
*/

import java.util.ArrayList;
class Solution {
    public boolean isValid(String s) {
        int p = 0;
        int b = 0;
        int c = 0;
        int n = s.length();
        ArrayList<String> latest = new ArrayList<String>();

        for (int i = 0; i < n; i ++)
        {
            switch(s.charAt(i)) {
                case '(':
                    p ++;
                    latest.add(0, "p");
                    break;
                case '[':
                    b ++;
                    latest.add(0, "b");
                    break;
                case '{':
                    c ++;
                    latest.add(0, "c");
                    break;
                case ')':
                    p --;
                    if (p < 0)
                        return false;
                    if (latest.get(0).equals("p")) {
                        latest.remove(0);
                        break;
                    }
                    else {
                        return false;
                    }
                case ']':
                    b --;
                    if (b < 0)
                        return false;
                    if (latest.get(0).equals("b")) {
                        latest.remove(0);
                        break;
                    }
                    else
                        return false;
                case '}':
                    c --;
                    if (c < 0)
                        return false;
                    if (latest.get(0).equals("c")) {
                        latest.remove(0);
                        break;
                    }
                    else
                        return false;

            }

        }

        if (p == 0 && b == 0 && c == 0)
            return true;
        else
            return false;
    }
}
