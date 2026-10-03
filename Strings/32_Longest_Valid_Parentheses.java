/*
 * LeetCode 32 - Longest Valid Parentheses
 *
 * Problem:
 * Given a string containing '(' and ')', find the length
 * of the longest valid (well-formed) parentheses substring.
 *
 * Approach:
 * Use a two-pass approach with two counters:
 *
 * 1. Left to Right:
 *    - Count opening and closing parentheses.
 *    - When open == close, we have a valid substring.
 *    - If close > open, reset both counters.
 *
 * 2. Right to Left:
 *    - Repeat the process in reverse.
 *    - If open > close, reset both counters.
 *    - This handles cases where there are extra '(' brackets.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();

        int open = 0;
        int close = 0;
        int result = 0;

        // Left to Right
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open++;
            } else {
                close++;
            }

            if (open == close) {
                result = Math.max(result, open + close);
            } else if (close > open) {
                open = close = 0;
            }
        }

        open = 0;
        close = 0;

        // Right to Left
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open++;
            } else {
                close++;
            }

            if (open == close) {
                result = Math.max(result, open + close);
            } else if (open > close) {
                open = close = 0;
            }
        }

        return result;
    }
}
