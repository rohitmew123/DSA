/*
 * LeetCode 162 - Find Peak Element
 *
 * Approach:
 * Traverse the array and check each element.
 * An element is a peak if it is greater than its
 * left and right neighbors.
 *
 * For the first element, only the right neighbor is checked.
 * For the last element, only the left neighbor is checked.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int findPeakElement(int[] nums) {

        for(int i = 0; i < nums.length; i++) {

            boolean left = (i == 0) || (nums[i] > nums[i - 1]);
            boolean right = (i == nums.length - 1) || (nums[i] > nums[i + 1]);

            if(left && right) {
                return i;
            }
        }

        return -1;
    }
}
