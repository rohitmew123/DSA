/*
Problem: LeetCode 2897 - Apply Operations on Array to Maximize Sum of Squares

Approach:
- Count the set bits at each bit position across all numbers.
- Build each number by using available set bits.
- Greedily construct the maximum possible number for each operation.
- Calculate its square and add it to the result.
- Apply modulo 10^9 + 7 to keep the result within limits.

Time Complexity: O(32 * n + 32 * k)
Space Complexity: O(1)
*/

import java.util.*;

class Solution {
    int MOD = 1_000_000_007;

    public int maxSum(List<Integer> nums, int k) {
        int[] count = new int[32];

        for (int num : nums) {
            for (int b = 0; b < 32; b++) {
                if ((num & (1 << b)) != 0) {
                    count[b]++;
                }
            }
        }

        long result = 0;

        while (k-- > 0) {
            long curr = 0;

            for (int b = 0; b < 32; b++) {
                if (count[b] > 0) {
                    count[b]--;
                    curr |= (1L << b);
                }
            }

            result = (result + curr * curr) % MOD;
        }

        return (int) result;
    }
}
