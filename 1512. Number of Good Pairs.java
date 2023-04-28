/*
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

https://leetcode.com/problems/number-of-good-pairs/
*/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> integerMap = new HashMap<Integer, Integer>();
        for (int num: nums) {
            if (integerMap.containsKey(num))
                integerMap.replace(num, integerMap.get(num) + 1);
            else
                integerMap.put(num, 1);
        }
        for (Map.Entry<Integer, Integer> entry: integerMap.entrySet()) {
            count += combinations(entry.getValue(), 2);
        }
        return count;
    }

    public int combinations(int n, int c) {
        if (n < c)
            return 0;
        double x = 1;
        for (int i = n; i >= 2; i --)
            x *= i;
        double y = 1;
        for (int i = n - c; i >= 2; i --)
            y *= i;
        
        return (int) (x / (y * c));
    }
}

