/*
LeetCode 1920 - Build Array from Permutation

Problem:
Given a zero-based permutation nums, build an array ans such that
ans[i] = nums[nums[i]] for each index i.

Approach:
1. Create a new array ans of the same size as nums.
2. Traverse the input array.
3. For each index i, store nums[nums[i]] in ans[i].
4. Return the resultant array.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] buildArray(int[] nums) {

        int [] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
        
    }
}
