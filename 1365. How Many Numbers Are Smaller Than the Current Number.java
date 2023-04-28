/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.

https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
*/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smaller = new int[nums.length];
        for (int i = 0; i < nums.length; i ++) {
            int count = 0;
            for(int num: nums) {
                count += (nums[i] > num) ? 1 : 0;
            }
            smaller[i] = count;
        }
        return smaller;
    }
}
