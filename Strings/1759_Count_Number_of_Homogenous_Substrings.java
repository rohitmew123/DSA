/*
 * LeetCode 1759 - Count Number of Homogenous Substrings
 *
 * Approach:
 * Keep track of the length of the current consecutive group
 * of the same character.
 *
 * For every character, 'length' represents the number of
 * new homogenous substrings ending at that character.
 * Add 'length' to the result.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int countHomogenous(String s) {

        int MOD = 1000000007;

        int length = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                length++;
            } else {
                length = 1;
            }

            result = (result + length) % MOD;
        }

        return result;
    }
}

class Solution {
    public int countHomogenous(String s) {

        int MOD = 1000000007;
        
        int length = 0;
        int result = 0;

        for(int i=0; i<s.length(); i++) {
           
            if( i>0 && s.charAt(i) == s.charAt(i-1)) {
                length++;
            } else {
                length = 1;
            }
            result =( result + length) % MOD;
        }
        return result;
        
    }
}
