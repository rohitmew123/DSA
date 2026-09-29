/*
 * LeetCode 880 - Decoded String at Index
 *
 * Problem:
 * Given an encoded string and an integer k, return the k-th
 * character of the decoded string without actually constructing
 * the complete decoded string.
 *
 * Approach:
 * 1. Traverse the string from left to right and calculate the
 *    length of the decoded string.
 * 2. Traverse from right to left.
 * 3. Use k % size to map k back to the current decoded length.
 * 4. When k becomes 0 at a letter, that letter is the answer.
 * 5. For a letter, decrease size by 1.
 * 6. For a digit, divide size by that digit.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public String decodeAtIndex(String s, int k) {

        int n = s.length();
        long size = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                size = size * (ch - '0');
            } else {
                size++;
            }
        }

        for (int i = n - 1; i >= 0; i--) {

            k = (int) (k % size);

            if (k == 0 && Character.isLetter(s.charAt(i))) {
                return String.valueOf(s.charAt(i));
            }

            if (Character.isLetter(s.charAt(i))) {
                size--;
            } else {
                size = size / (s.charAt(i) - '0');
            }
        }

        return "";
    }
}
