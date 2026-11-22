
class Solution {
    /*
     * Approach: Single Traversal
     *
     * Check adjacent characters.
     * If 'b' appears before 'a', return false.
     * Otherwise, return true.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    public boolean checkString(String s) {
        int n = s.length();

        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) == 'b' &&
                s.charAt(i) == 'a') {
                return false;
            }
        }

        return true;
    }
}
