/*
 * LeetCode 2486 - Append Characters to String to Make Subsequence
 *
 * Approach:
 * Use two pointers i and j.
 * i traverses string s and j traverses string t.
 * If characters match, move both pointers.
 * Otherwise, move only i.
 *
 * After traversing s, the remaining characters of t
 * need to be appended.
 *
 * Time Complexity: O(m)
 * Space Complexity: O(1)
 */

class Solution {
    public int appendCharacters(String s, String t) {
        int m = s.length();
        int n = t.length();

        int i = 0;
        int j = 0;

        while (i < m && j < n) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }

        return n - j;
    }
}
