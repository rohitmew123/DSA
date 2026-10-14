
/*
 * Problem: 3046 - Split the Array
 *
 * Approach: Frequency Counting
 *
 * 1. Create a frequency array of size 101.
 * 2. Traverse the input array and count each number.
 * 3. If any number appears more than twice, return false.
 * 4. Otherwise, return true.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] count = new int[101];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;

            if (count[nums[i]] > 2) {
                return false;
            }
        }

        return true;
    }
}
