/*
You are given a 0-indexed array of strings garbage where garbage[i] represents the assortment of garbage at the ith house. garbage[i] consists only of the characters 'M', 'P' and 'G' representing one unit of metal, paper and glass garbage respectively. Picking up one unit of any type of garbage takes 1 minute.

You are also given a 0-indexed integer array travel where travel[i] is the number of minutes needed to go from house i to house i + 1.

There are three garbage trucks in the city, each responsible for picking up one type of garbage. Each garbage truck starts at house 0 and must visit each house in order; however, they do not need to visit every house.

Only one garbage truck may be used at any given moment. While one truck is driving or picking up garbage, the other two trucks cannot do anything.

Return the minimum number of minutes needed to pick up all the garbage.

https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/
*/

class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int total = 0;
        int n = garbage.length;
        /* how far the garbage truck (M, P, and G respectively) has to go.
         * -1 means the garbage truck does not have to move
         */
        int[] farthest = new int[3];
        for (int i = 0; i <= 2; i ++)
            farthest[i] = -1;

        String trash = "";
        for (int i = n - 1; i >= 0; i --) {
            if (garbage[i].contains("M") && farthest[0] == -1)
                farthest[0] = i;
            if (garbage[i].contains("P") && farthest[1] == -1)
                farthest[1] = i;
            if (garbage[i].contains("G") && farthest[2] == -1)
                farthest[2] = i;
            if (farthest[0] != -1 && farthest[1] != -1 & farthest[2] != -1)
                break;
                
        }
        total += Arrays.asList(garbage).toString().replaceAll("[\\[\\], ]", "").length();
        /*
        total += trash.replaceAll("[PG]", "").length();
        total += trash.replaceAll("[MG]", "").length();
        total += trash.replaceAll("[MP]", "").length();
        */

        for (int i = 1; i < n; i ++) {
            for (int j = 0; j <= 2; j ++) {
                if (farthest[j] >= i) {
                    total += travel[i - 1];
                }
            }
        }
        
        

        

        return total;
    }
}
