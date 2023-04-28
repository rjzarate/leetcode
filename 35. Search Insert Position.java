/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

https://leetcode.com/problems/search-insert-position/
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int n = nums.length;
        int previousTerm = nums[n / 2];
        int index = n / 2;
        int step = (int) Math.ceil(n / 4.0);
        boolean skip = (step == 1) ? false : true;

        while (true)
        {
            if (index >= n || index < 0) {
                index = (index < 0) ? 0 : n;
                break;
            }
            else if (!(skip) && previousTerm < target && target < nums[index])
                break;
            else if (nums[index] == target)
                break;
            else if (nums[index] > target) {
                previousTerm = nums[index];
                index -= step;
                skip = (step == 1) ? false : true;
                step = (int) Math.ceil(step / 2.0);
            }
            else if (nums[index] < target) {
                previousTerm = nums[index];
                index += step;
                skip = (step == 1) ? false : true;
                step = (int) Math.ceil(step / 2.0);
            }
            

        }
        return index;
    }
}
