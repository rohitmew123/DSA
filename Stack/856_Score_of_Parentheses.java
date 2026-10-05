import java.util.Stack;

/*
 * LeetCode 856 - Score of Parentheses
 *
 * Problem:
 * Given a balanced parentheses string, calculate its score.
 *
 * Rules:
 * 1. "()" has score 1.
 * 2. AB has score A + B.
 * 3. (A) has score 2 * A.
 *
 * Approach: Stack
 *
 * 1. Initialize a stack with 0 for the outer score.
 * 2. When '(' appears, push 0 to start a new level.
 * 3. When ')' appears, pop the inner score.
 * 4. Calculate the score using max(2 * inner, 1).
 * 5. Add this score to the previous level.
 * 6. Return the final score.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                stack.push(0);
            } else {
                int inner = stack.pop();
                int score = Math.max(2 * inner, 1);

                int outer = stack.pop();
                stack.push(outer + score);
            }
        }

        return stack.pop();
    }
}
