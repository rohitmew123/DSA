
/*
 * LeetCode 453: Minimum Moves to Equal Array Elements
 *
 * Problem:
 * In each move, increment n - 1 elements by 1.
 * Find the minimum moves required to make all elements equal.
 *
 * Approach:
 * 1. Find the minimum element in the array.
 * 2. Calculate the difference between every element and the minimum.
 * 3. Add all differences to get the minimum number of moves.
 *
 * Time Complexity: O(n)
 * Auxiliary Space Complexity: O(1)
 */

class Solution {
    public int minMoves(int[] nums) {
        int operation = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            operation += nums[i] - min;
        }

        return operation;
    }
}
