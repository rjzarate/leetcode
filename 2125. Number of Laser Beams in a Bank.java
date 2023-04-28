/*
Anti-theft security devices are activated inside a bank. You are given a 0-indexed binary string array bank representing the floor plan of the bank, which is an m x n 2D matrix. bank[i] represents the ith row, consisting of '0's and '1's. '0' means the cell is empty, while'1' means the cell has a security device.

There is one laser beam between any two security devices if both conditions are met:

The two devices are located on two different rows: r1 and r2, where r1 < r2.
For each row i where r1 < i < r2, there are no security devices in the ith row.
Laser beams are independent, i.e., one beam does not interfere nor join with another.

Return the total number of laser beams in the bank.

https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
*/

import java.util.Arrays;
class Solution {
    public int numberOfBeams(String[] bank) {
        int beamCount = 0;
        for (int i = 0; i < bank.length; i ++) {
            bank[i] = bank[i].replaceAll("0", "");
        }
        /*
        ArrayList<Integer> laserBeams = new ArrayList<Integer>();
        for (int i = 0; i < bank.length; i ++) {
            if (bank[i].length() != 0) {
                laserBeams.add(bank.length);
            }
        }
        */
        
        ArrayList<String> bankList = new ArrayList<String>(Arrays.asList(bank));
        ArrayList<String> emptyList = new ArrayList<String>();
        emptyList.add("");
        bankList.removeAll(emptyList);
        
        for (int i = 0; i < bankList.size() - 1; i ++) {
            beamCount += bankList.get(i).length() * bankList.get(i + 1).length();
        }
        
        /*
        for (int i = 0; i < laserBeams.size() - 1; i ++) {
            beamCount += laserBeams.get(i) * laserBeams.get(i + 1);
        }
        */
        
        return beamCount;
    }
}
