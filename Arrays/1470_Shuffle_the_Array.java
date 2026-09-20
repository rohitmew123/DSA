/*
 * LeetCode 1470 - Shuffle the Array
 *
 * Approach:
 * The array is divided into two halves:
 * [x1, x2, ..., xn, y1, y2, ..., yn]
 *
 * We place elements alternately in the result array:
 * x1, y1, x2, y2, ..., xn, yn
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[nums.length];

        for(int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }

        return result;
    }
}
