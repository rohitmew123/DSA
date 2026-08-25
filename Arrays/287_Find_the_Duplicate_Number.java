/*
LeetCode 287 - Find the Duplicate Number

Problem:
Given an array nums containing n + 1 integers where each integer
is in the range [1, n], find the duplicate number.

Approach:
1. Traverse the array and take the absolute value of each element.
2. Use the value as an index to mark the corresponding element as negative.
3. If the value at that index is already negative, the number is a duplicate.
4. Store the duplicate number and stop the traversal.
5. Restore the array by converting all elements back to positive values.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int findDuplicate(int[] nums) {

        int ans = 0;

        for(int i=0; i<nums.length; i++) {
            int ele = nums[i];
            ele = Math.abs(ele);

            if(nums[ele] > 0) {
                nums[ele] = - nums[ele];
            }
            else {
                ans = ele;
                break;
            }
        }
        for(int i=0; i<nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        return ans;
        
    }
}
