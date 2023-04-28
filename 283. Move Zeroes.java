/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

https://leetcode.com/problems/move-zeroes/
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int c = 0;
        for (int i = n - 1; i > 0; i --) {
            if (nums[i] == 0) {
                c ++;
            } else
                break;
        }
        for (int i = 0; i < n - c; i ++) {
            if (nums[i] == 0) {
                for (int j = i; j < n - c - 1; j ++) {
                    nums[j] = nums[j + 1];
                }
                for (int j = n - c - 1; j > 0; j --) {
                    if (nums[j] != 0) {
                        nums[j] = 0;
                        break;
                    }
                }
                c ++;
                i--;
            }
        }
        
    }
}
