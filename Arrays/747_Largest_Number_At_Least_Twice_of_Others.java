/*
LeetCode 747 - Largest Number At Least Twice of Others

Problem:
Given an integer array nums, return the index of the largest element
if it is at least twice as large as every other number.
Otherwise, return -1.

Approach:
1. Find the largest element and store its index.
2. Traverse the array again.
3. Skip the largest element itself.
4. Check if the largest element is at least twice every other element.
5. If the condition fails, return -1.
6. Otherwise, return the index of the largest element.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int dominantIndex(int[] nums) {

        int max = nums[0];
        int index = 0;

        for(int i=1; i<nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        
        for(int i=0; i<nums.length; i++) {

            if(i != index && max < nums[i] * 2) {
                return -1;
            }
        }   
        return index;
        
    }
}
