/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

https://leetcode.com/problems/majority-element/
*/
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> appearances = new HashMap<Integer, Integer>();
        int num = 0;
        int n = nums.length;
        Integer majority = (int) Math.ceil(n / 2.0);

        for (int i = 0; i < n; i ++) {
            if (appearances.containsKey(nums[i]))
                appearances.replace(nums[i], appearances.get(nums[i]) + 1);
            else
                appearances.put(nums[i], 1);

            if (appearances.get(nums[i]).equals(majority)) {
                num = nums[i];
                break;
            }
        }
        return num;
    }
}
