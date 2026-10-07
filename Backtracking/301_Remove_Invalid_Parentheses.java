/*
 * LeetCode 301 - Remove Invalid Parentheses
 *
 * Approach:
 * Use DFS and Backtracking to generate all possible valid strings.
 *
 * For every parenthesis, we have two choices:
 * 1. Keep the parenthesis.
 * 2. Remove the parenthesis.
 *
 * If the number of closing parentheses becomes greater than
 * opening parentheses, the current path is invalid and we stop.
 *
 * At the end, only strings with balanced parentheses are considered.
 *
 * maxLen stores the maximum length of a valid string.
 * Since we need to remove the minimum number of parentheses,
 * only valid strings having maximum length are stored.
 *
 * HashSet is used to avoid duplicate results.
 *
 * Time Complexity: O(2^n * n) in the worst case
 * Space Complexity: O(2^n * n)
 */

import java.util.*;

class Solution {

    Set<String> st = new HashSet<>();
    int maxLen = 0;

    public void solve(String s, int i, String curr, int count) {

        if(count < 0) {
            return;
        }

        if(i == s.length()) {

            if(count == 0) {

                if(curr.length() > maxLen) {
                    maxLen = curr.length();
                    st.clear();
                }

                if(curr.length() == maxLen) {
                    st.add(curr);
                }
            }

            return;
        }

        char ch = s.charAt(i);

        if(ch != '(' && ch != ')') {
            solve(s, i + 1, curr + ch, count);
            return;
        }

        // Keep the current parenthesis
        curr += ch;

        if(ch == '(') {
            solve(s, i + 1, curr, count + 1);
        } else {
            solve(s, i + 1, curr, count - 1);
        }

        // Backtrack
        curr = curr.substring(0, curr.length() - 1);

        // Remove the current parenthesis
        solve(s, i + 1, curr, count);
    }

    public List<String> removeInvalidParentheses(String s) {

        st.clear();
        maxLen = 0;

        solve(s, 0, "", 0);

        return new ArrayList<>(st);
    }
}
