```java
/*
 * LeetCode 462: Minimum Moves to Equal Array Elements II
 *
 * Problem:
 * Find the minimum number of moves required to make all
 * array elements equal. In one move, increment or decrement
 * any one element by 1.
 *
 * Approach:
 * 1. Sort the array.
 * 2. Find the median using index n / 2.
 * 3. Calculate the absolute difference between each element
 *    and the median.
 * 4. Add all differences to get the minimum moves.
 *
 * Time Complexity: O(n log n)
 * Auxiliary Space: Depends on the sorting implementation.
 */

import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        int sum = 0;

        Arrays.sort(nums);

        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            sum += Math.abs(nums[mid] - nums[i]);
        }

        return sum;
    }
}
```
