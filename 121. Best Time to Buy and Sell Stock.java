/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/

import java.lang.Integer;

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if (n == 0)
            return 0;

        int cheapest = Integer.MAX_VALUE;
        int bestPrice = Integer.MIN_VALUE;
        for (int i = 0; i < n; i ++) {

            if (cheapest > prices[i]) {
                for (int j = i + 1; j < n; j ++) {
                    bestPrice = (prices[j] - prices[i] > bestPrice) ? prices[j] - prices[i] : bestPrice;
                }
                cheapest = prices[i];
            }
        }

        bestPrice = (bestPrice < 0) ? 0 : bestPrice;
        return bestPrice;
        
    }
}
