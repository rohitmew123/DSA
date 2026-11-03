/*
 * LeetCode 3736 - Minimum Moves to Equal Array Elements III
 *
 * Problem:
 * Find the minimum number of moves required to make all
 * array elements equal by incrementing elements.
 *
 * Approach:
 * 1. Find the maximum element in the array.
 * 2. Calculate the difference between the maximum
 *    and every array element.
 * 3. Add all differences to get the minimum moves.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += max - nums[i];
        }

        return sum;
    }
}
