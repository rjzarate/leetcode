/*
You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.

https://leetcode.com/problems/sort-the-people/description/
*/

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] namesSorted = new String[n];
        

        for (int i = 0; i < n; i ++) {
            int tallest = heights[0];
            int index = 0;
            for (int j = 0; j < n; j ++) {
                if (tallest < heights[j]) {
                    tallest = heights[j];
                    index = j;
                }
            }
            namesSorted[i] = names[index];
            heights[index] = -1;
        }
        return namesSorted;
    }
}
