
/*
 * Problem: 2913 - Subarrays Distinct Element Sum of Squares I
 *
 * Approach: Brute Force + HashSet
 *
 * 1. Select each possible starting index.
 * 2. Create a HashSet to store distinct elements.
 * 3. Expand the subarray using the inner loop.
 * 4. Add each element to the set.
 * 5. Add the square of the distinct count to ans.
 * 6. Return the total sum.
 *
 * Time Complexity: O(n^2) average
 * Space Complexity: O(n)
 */

import java.util.*;

class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;

        for (int i = 0; i < nums.size(); i++) {
            Set<Integer> set = new HashSet<>();

            for (int j = i; j < nums.size(); j++) {
                set.add(nums.get(j));
                ans += set.size() * set.size();
            }
        }

        return ans;
    }
}
