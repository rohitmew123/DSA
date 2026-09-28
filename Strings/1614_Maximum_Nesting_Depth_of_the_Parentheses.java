/*
 * LeetCode 1614 - Maximum Nesting Depth of the Parentheses
 *
 * Problem:
 * Given a valid parentheses string, find the maximum number
 * of nested parentheses at any point.
 *
 * Approach:
 * 1. Traverse the string character by character.
 * 2. When '(' is found, increase the current depth.
 * 3. Update the maximum depth.
 * 4. When ')' is found, decrease the current depth.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxDepth(String s) {

        int res = 0;
        int curr = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                curr++;
                res = Math.max(res, curr);
            }

            if (ch == ')') {
                curr--;
            }
        }

        return res;
    }
}
