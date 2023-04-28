/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

https://leetcode.com/problems/pascals-triangle/
*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> row = new ArrayList<Integer>();
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        if (numRows >= 1) {
            row.add(1);
            triangle.add(row);
            row = new ArrayList<Integer>();
        }

        if (numRows >= 2) {
            row.add(1);
            row.add(1);
            triangle.add(row);
            row = new ArrayList<Integer>();
        }

        for (int i = 2; i < numRows; i ++) {
            row.add(1);
            for(int j = 0; j < i - 1; j ++) {
                row.add(triangle.get(i - 1).get(j) + triangle.get(i - 1).get(j + 1));
            }
            row.add(1);
            triangle.add(row);
            row = new ArrayList<Integer>();
        }
        return triangle;
    }
}
