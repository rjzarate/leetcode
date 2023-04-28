/*
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

https://leetcode.com/problems/concatenation-of-array/
*/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] doubleNums = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i ++) {
            doubleNums[i] = nums[i];
            doubleNums[i + nums.length] = nums[i];
        }
        return doubleNums;
    }
}
