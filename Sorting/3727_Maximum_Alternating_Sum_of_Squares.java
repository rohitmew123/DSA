
/*
 * Problem: 3727 - Maximum Alternating Sum of Squares
 *
 * Approach: Sorting and Greedy
 *
 * 1. Square every element in the array.
 * 2. Sort the squared values in ascending order.
 * 3. Calculate the sum of the smaller half.
 * 4. Calculate the sum of the larger half.
 * 5. Return largeHalf - smallHalf.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(log n) auxiliary space, typically
 *                   used by Java's primitive-array sorting.
 */

import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        long largeHalf = 0;
        long smallHalf = 0;

        for (int i = 0; i < n / 2; i++) {
            smallHalf += nums[i];
        }

        for (int i = n / 2; i < n; i++) {
            largeHalf += nums[i];
        }

        return largeHalf - smallHalf;
    }
}
