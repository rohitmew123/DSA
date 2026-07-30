/*
LeetCode 1752 - Check if Array Is Sorted and Rotated

Problem:
Given an integer array nums, return true if the array was originally sorted
in non-decreasing order and then rotated some number of positions (including zero).
Otherwise, return false.

Approach:
1. Traverse the array once.
2. Count the number of positions where the current element is greater than the next element.
3. Use modulo (%) to compare the last element with the first element.
4. If the count of such positions is at most one, the array is sorted and rotated.
5. Otherwise, return false.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean check(int[] nums) {

        int n = nums.length;
        int count = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] > nums[(i+1) % n]) {
                count++;
            }
        }
        return count <= 1;   
        
    }
}
