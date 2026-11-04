/*
 * LeetCode 2965 - Find Missing and Repeated Values
 *
 * Problem:
 * Given an n x n grid containing numbers from 1 to n*n,
 * find the repeated number and the missing number.
 *
 * Approach: Frequency Array
 * 1. Create a frequency array of size n*n + 1.
 * 2. Traverse the 2D grid using nested loops.
 * 3. Increase the frequency of each encountered number.
 * 4. Traverse the frequency array:
 *      - Frequency == 2 -> Repeated number
 *      - Frequency == 0 -> Missing number
 * 5. Return both numbers in an array.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(n^2)
 */

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[] freq = new int[n * n + 1];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                freq[grid[i][j]]++;
            }
        }

        int repeated = 0;
        int missing = 0;

        for(int i = 1; i < freq.length; i++) {

            if(freq[i] == 2) {
                repeated = i;
            }

            if(freq[i] == 0) {
                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }
}
