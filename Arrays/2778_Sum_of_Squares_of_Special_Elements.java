/*
Problem: LeetCode 2778 - Sum of Squares of Special Elements

Approach:
- Find the length of the array.
- Traverse the array using a loop.
- Check whether the array length is divisible by the
  current 1-based index (i + 1).
- If divisible, add the square of that element to the sum.
- Return the final sum.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                count += nums[i] * nums[i];
            }
        }

        return count;
    }
}
