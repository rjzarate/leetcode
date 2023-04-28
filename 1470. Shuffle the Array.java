/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

https://leetcode.com/problems/shuffle-the-array/
*/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffledNums = new int[nums.length];
        for (int i = 0; i < nums.length; i += 2) {
            shuffledNums[i] = nums[i / 2];
            shuffledNums[i + 1] = nums[i / 2 + nums.length / 2];
        }

        return shuffledNums;
    }
}
