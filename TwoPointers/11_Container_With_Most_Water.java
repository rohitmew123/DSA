/*
LeetCode 11 - Container With Most Water

Approach:
1. Use two pointers (left and right) at both ends of the array.
2. Calculate the current water area using:
   Area = min(height[left], height[right]) * (right - left)
3. Update the maximum area.
4. Move the pointer with the smaller height inward.
5. Continue until both pointers meet.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxArea(int[] height) {

        int maxWater = 0;
        int lp = 0; 
        int rp = height.length-1;

        while(lp < rp) {
            int ht = Math.min(height[lp], height[rp]);
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            if(height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
        
    }
}
