/*
 * LeetCode 1111 - Maximum Nesting Depth of Two Valid Parentheses Strings
 *
 * Problem:
 * Split a valid parentheses string into two groups such that
 * the maximum nesting depth of both groups is minimized.
 *
 * Approach:
 * 1. Maintain the current nesting depth.
 * 2. For '(' increase the depth first, then assign the group
 *    based on depth parity.
 * 3. For ')' assign the group using the current depth, then
 *    decrease the depth.
 * 4. Odd depth -> group 1
 *    Even depth -> group 0
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] maxDepthAfterSplit(String seq) {

        int[] result = new int[seq.length()];
        int d = 0;

        for (int i = 0; i < seq.length(); i++) {

            if (seq.charAt(i) == '(') {
                d++;
                result[i] = d % 2;
            } else {
                result[i] = d % 2;
                d--;
            }
        }

        return result;
    }
}
