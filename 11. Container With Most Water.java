/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

https://leetcode.com/problems/container-with-most-water/description/
*/

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int n = height.length;
        int c = 0;
        int h = 0;
        for (int i = 0; i < n; i ++)
        {
            if (c < height[i])
            {
                for (int j = n - 1; j > i; j --)
                {
                    //h = (height[i] > height[j]) ? height[j] : height[i];
                    //maxArea = (maxArea > h * (j - i)) ? maxArea : h * (j - i);
                    maxArea = (maxArea > Math.min(height[i], height[j]) * (j - i)) ? maxArea : Math.min(height[i], height[j]) * (j - i);
                }
                c = height[i];
            }  
        }
        
        return maxArea;
    }
}
