/*
Given an integer x, return true if x is a palindrome, and false otherwise.

https://leetcode.com/problems/palindrome-number/
*/
import java.util.logging.*;
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x <= 9)
            return true;

        int size = 0;
        for (int i = x; i != 0; i = i) {
            i /= 10;
            size ++;
        }

        int[] digits = new int[size];


        for (int i = 0; i < size; i ++) {
            digits[i] = (int) (x % Math.pow(10, i + 1) / Math.pow(10, i));
            System.out.println(digits[i]);
        }

        for (int i = 0; i < size / 2; i ++) {
            if (digits[i] != digits[size - i - 1])
                return false;
        }
        return true;
    }
}
