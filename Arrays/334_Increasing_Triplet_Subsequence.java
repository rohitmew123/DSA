/*
LeetCode 334 - Increasing Triplet Subsequence

Problem:
Given an integer array nums, return true if there exists
an increasing triplet such that:

nums[i] < nums[j] < nums[k]
and
i < j < k

Otherwise, return false.

Approach:
1. Maintain two variables: first and second.
2. first stores the smallest value found so far.
3. second stores the smallest value greater than first.
4. If a number is greater than both first and second,
   an increasing triplet exists.
5. Return true immediately.
6. If no such triplet is found, return false.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++) {

            int ele = nums[i];

            if(first >= ele) {
                first = ele;
            } 
            else if(second >=ele) {
                second = ele;
            }
            else {
                third = ele;
                return true;
            } 
            
        }
        return false;
        
    }
}
