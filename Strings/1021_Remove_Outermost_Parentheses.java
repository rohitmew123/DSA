/*
 * LeetCode 1021 - Remove Outermost Parentheses
 *
 * Approach:
 * Use a counter to track the current depth of parentheses.
 *
 * For '(':
 *     If count > 0, it is not an outermost parenthesis,
 *     so add it to the result.
 *     Then increase count.
 *
 * For ')':
 *     First decrease count.
 *     If count > 0, it is not an outermost parenthesis,
 *     so add it to the result.
 *
 * StringBuilder is used to build the resulting string.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder result = new StringBuilder();

        int count = 0;

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(ch == '(') {

                if(count > 0) {
                    result.append(ch);
                }

                count++;

            } else {

                count--;

                if(count > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}
