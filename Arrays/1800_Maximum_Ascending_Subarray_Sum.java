/*
LeetCode 1800 - Maximum Ascending Subarray Sum

Problem:
Given an array of positive integers, find the maximum sum
of an ascending subarray.

Approach:
1. Maintain currmax for the sum of the current ascending subarray.
2. Maintain max for the maximum sum found so far.
3. If the current element is greater than the previous element,
   add it to currmax.
4. Otherwise, update max and start a new ascending subarray.
5. After the loop, update max one more time to handle the
   last ascending subarray.
6. Return max.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxAscendingSum(int[] nums) {
    
        int max = nums[0];
        int currmax = nums[0];

        for(int i=1; i<nums.length; i++) {

            if(nums[i-1] < nums[i]) {
                currmax = currmax + nums[i];
            }
            else {
                max = Math.max(max, currmax);
                currmax = nums[i];
            }
        }
        max = Math.max(max, currmax);
        return max;
        
    }
}
