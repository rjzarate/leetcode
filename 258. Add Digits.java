/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

https://leetcode.com/problems/add-digits/
*/

class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while (num != 0 || sum >= 10) {
            sum += num % 10;
            num /= 10;
            if (num == 0 && sum >= 10) {
                num = sum;
                sum = 0;
            }
        }
        return sum;
    }
}
