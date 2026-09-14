/*
 * LeetCode 3084 - Count Substrings Starting and Ending with Given Character
 *
 * Approach:
 * Count how many times the given character appears in the string.
 * For every occurrence, the current character can form a valid
 * substring with itself and with every previous occurrence.
 *
 * Therefore, if count previous occurrences = count,
 * then current occurrence creates (1 + count) new substrings.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public long countSubstrings(String s, char c) {

        long count = 0;
        long substrings = 0;

        for (char ch : s.toCharArray()) {
            if (ch == c) {
                substrings = substrings + (1 + count);
                count++;
            }
        }

        return substrings;
    }
}
