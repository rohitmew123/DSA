/*
 * LeetCode 678 - Valid Parenthesis String
 *
 * Problem:
 * Given a string containing '(', ')' and '*', determine whether
 * the string can be converted into a valid parentheses string.
 *
 * '*' can be treated as:
 * 1. '('
 * 2. ')'
 * 3. Empty string
 *
 * Approach:
 * Use a Greedy Range approach with two variables:
 *
 * minOpen = minimum possible number of unmatched '('
 * maxOpen = maximum possible number of unmatched '('
 *
 * For '(':
 *     minOpen++ and maxOpen++
 *
 * For ')':
 *     minOpen-- and maxOpen--
 *
 * For '*':
 *     minOpen-- (treat '*' as ')')
 *     maxOpen++ (treat '*' as '(')
 *
 * minOpen cannot be negative, so reset it to 0.
 * If maxOpen becomes negative, no valid interpretation is possible.
 *
 * At the end, if minOpen is 0, at least one valid interpretation exists.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean checkValidString(String s) {

        if (s.length() == 0) {
            return true;
        }

        int minOpen = 0;
        int maxOpen = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                minOpen++;
                maxOpen++;
            }

            if (ch == ')') {
                minOpen--;
                maxOpen--;

                if (minOpen < 0) {
                    minOpen = 0;
                }

                if (maxOpen < 0) {
                    return false;
                }
            }

            if (ch == '*') {
                minOpen--;
                maxOpen++;

                if (minOpen < 0) {
                    minOpen = 0;
                }
            }
        }

        return minOpen == 0;
    }
}
