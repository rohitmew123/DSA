/*
LeetCode 2529 - Maximum Count of Positive Integer and Negative Integer

Problem:
Given a sorted integer array, find the maximum count between
positive integers and negative integers.

Approach:
1. Traverse the array once.
2. Count positive numbers in max.
3. Count negative numbers in min.
4. Ignore zero because it is neither positive nor negative.
5. Return the larger count using Math.max().

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maximumCount(int[] nums) {

        int max = 0;
        int min = 0;

        for(int i=0; i<nums.length; i++) {

            if(nums[i] > 0) {
                max = max + 1;

            }
            if(nums[i] < 0) {
                min = min + 1;
            }
        }
        int highest = Math.max(max, min);
        return highest;
        
        
    }
}
