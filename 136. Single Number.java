/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

https://leetcode.com/problems/single-number/
*/

import java.util.Map.Entry;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Boolean> duplicates = new HashMap<Integer, Boolean>();
        int n = nums.length;

        for (int i = 0; i < n; i ++)
        {
            if (duplicates.containsKey(nums[i]))
                duplicates.replace(nums[i], true);
            else
                duplicates.put(nums[i], false);
        }
        int num = 0;
        for (Entry<Integer, Boolean> duplicate: duplicates.entrySet())
        {
            if (!(duplicate.getValue())) {
                num = duplicate.getKey();
                break;
            }
        }
        return num;
    }
}
