/*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

https://leetcode.com/problems/search-a-2d-matrix/
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int index = 0;
        int n = matrix[0].length;
        boolean foundRow = false;
        for (int[] row: matrix) {
             if (row[n - 1] >= target) {
                 foundRow = true;
                 break;
             }
             index ++;
        }
        if (!(foundRow))
            return false;
        
        for (int number: matrix[index]) {
            if (number == target)
                return true;

        }
        return false;
    }
}
