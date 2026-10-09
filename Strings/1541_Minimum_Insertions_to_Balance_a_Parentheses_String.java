/*
 * LeetCode 1541 - Minimum Insertions to Balance a Parentheses String
 *
 * Approach: Greedy
 *
 * count represents the number of closing ')' brackets required.
 * Every '(' requires two consecutive ')' brackets.
 *
 * If '(' appears:
 *     Increase count by 2.
 *     If count becomes odd, insert one ')' to complete the pair.
 *     Increase result and decrease count.
 *
 * If ')' appears:
 *     Decrease count by 1.
 *     If count becomes negative, insert one '('.
 *     Increase result and set count to 1 because one ')' is still needed.
 *
 * Finally, add the remaining required closing brackets to result.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int minInsertions(String s) {

        int result = 0;
        int count = 0;

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(ch == '(') {

                count += 2;

                if(count % 2 != 0) {
                    result++;
                    count--;
                }

            } else {

                count--;

                if(count < 0) {
                    result++;
                    count = 1;
                }
            }
        }

        return result + count;
    }
}
