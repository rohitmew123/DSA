/*
 * LeetCode 22 - Generate Parentheses
 *
 * Problem:
 * Given n pairs of parentheses, generate all combinations
 * of well-formed parentheses.
 *
 * Approach:
 * Use recursion and backtracking.
 *
 * 1. Add '(' if the number of opening brackets used is less than n.
 * 2. Add ')' only when the number of closing brackets is less
 *    than the number of opening brackets.
 * 3. When the current string length becomes 2 * n, add it
 *    to the result.
 *
 * Time Complexity: O(Cn * n)
 * Space Complexity: O(Cn * n)
 * where Cn is the nth Catalan number.
 */

class Solution {

    public static void generate(String current, int open, int close,
                                int n, List<String> result) {

        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            generate(current + "(", open + 1, close, n, result);
        }

        if (close < open) {
            generate(current + ")", open, close + 1, n, result);
        }
    }

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        generate("", 0, 0, n, result);

        return result;
    }
}
