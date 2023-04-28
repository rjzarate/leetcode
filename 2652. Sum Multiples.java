/*
Given a positive integer n, find the sum of all integers in the range [1, n] inclusive that are divisible by 3, 5, or 7.

Return an integer denoting the sum of all numbers in the given range satisfying the constraint.

https://leetcode.com/problems/sum-multiples/
*/

class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        /*
        sum += 3 * ((n / 3) * (n / 3 + 1) / 2);
        //System.out.println(3 * ((n / 3) * (n / 3 + 1) / 2));
        sum += 5 * ((n / 5) * (n / 5 + 1) / 2);
        //System.out.println(5 * ((n / 5) * (n / 5 + 1) / 2));
        sum += 7 * ((n / 7) * (n / 7 + 1) / 2);
        //System.out.println(7 * ((n / 7) * (n / 7 + 1) / 2));

        sum -= 15 * ((n / 15) * (n / 15 + 1) / 2);
        sum -= 21 * ((n / 21) * (n / 21 + 1) / 2);
        sum -= 35 * ((n / 35) * (n / 35 + 1) / 2);
        sum -= 2 * (315 * ((n / 315) * (n / 315 + 1) / 2));
        */
        for (int i = 3; i <= n; i ++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
                sum += i;
        }
        return sum;
    }
}
