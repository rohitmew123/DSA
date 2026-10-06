/*
 * LeetCode 921 - Minimum Add to Make Parentheses Valid
 *
 * Approach:
 * Use two counters instead of a Stack.
 *
 * size -> number of unmatched '('
 * open -> number of unmatched ')' that need an opening '('
 *
 * For '(':
 *     Increase size.
 *
 * For ')':
 *     If an unmatched '(' exists, match it by decreasing size.
 *     Otherwise, increase open because an '(' is required.
 *
 * At the end:
 *     size = unmatched '(' brackets requiring ')'
 *     open = unmatched ')' brackets requiring '('
 *
 * Answer = size + open
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

/*
 * LeetCode 921 - Minimum Add to Make Parentheses Valid
 *
 * Approach:
 * Use two counters instead of a Stack.
 *
 * size -> number of unmatched '('
 * open -> number of unmatched ')' that need an opening '('
 *
 * For '(':
 *     Increase size.
 *
 * For ')':
 *     If size > 0, match it with an existing '('.
 *     Otherwise, increase open because an '(' is required.
 *
 * At the end:
 *     size = unmatched '(' brackets requiring ')'
 *     open = unmatched ')' brackets requiring '('
 *
 * Answer = size + open
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int minAddToMakeValid(String s) {

        int size = 0;
        int open = 0;

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(ch == '(') {
                size++;
            } 
            else if(size > 0) {
                size--;
            } 
            else {
                open++;
            }
        }

        return size + open;
    }
}
