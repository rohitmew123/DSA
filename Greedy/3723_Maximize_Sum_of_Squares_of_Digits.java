
/*
 * Problem: 3723 - Maximize Sum of Squares of Digits
 *
 * Approach: Greedy
 *
 * 1. Check whether the required digit sum is possible.
 * 2. Calculate the number of 9s using sum / 9.
 * 3. Calculate the remainder using sum % 9.
 * 4. Append all 9s, then the remainder if positive.
 * 5. Append zeros until the required length is reached.
 *
 * Time Complexity: O(num)
 * Space Complexity: O(num)
 */

class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) {
            return "";
        }

        int nines = sum / 9;
        int remain = sum % 9;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < nines; i++) {
            result.append('9');
        }

        if (remain > 0) {
            result.append(remain);
        }

        while (result.length() < num) {
            result.append('0');
        }

        return result.toString();
    }
}
