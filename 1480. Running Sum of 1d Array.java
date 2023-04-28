/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

https://leetcode.com/problems/running-sum-of-1d-array/
*/

class Solution {
    public int[] runningSum(int[] nums) {
        int[] sumArray = new int[nums.length];
        int sum = 0;
        int i = 0;
        for (int num: nums) {
            sum += num;
            sumArray[i] = sum;
            i ++;
        }
        return sumArray;
    }
}
