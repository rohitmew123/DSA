/*
 * LeetCode 2947 - Count Beautiful Substrings I
 *
 * Approach:
 * Generate every possible substring using two loops.
 * For each substring, count vowels and consonants.
 *
 * A substring is beautiful if:
 * 1. Number of vowels equals number of consonants.
 * 2. (vowels * consonants) is divisible by k.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

class Solution {
    public int beautifulSubstrings(String s, int k) {

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int conso = 0;
            int vowels = 0;

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                if (ch == 'a' || ch == 'e' || ch == 'o'
                        || ch == 'i' || ch == 'u') {
                    vowels++;
                } else {
                    conso++;
                }

                if (vowels == conso && (vowels * conso) % k == 0) {
                    result++;
                }
            }
        }

        return result;
    }
}
