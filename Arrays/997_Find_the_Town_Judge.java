/*
 * LeetCode 997 - Find the Town Judge
 *
 * Approach:
 * Use a count array to track the trust relationship.
 *
 * For each [u, v]:
 * - u trusts someone, so count[u]--
 * - v is trusted by someone, so count[v]++
 *
 * The Town Judge trusts nobody and is trusted by n - 1 people.
 * Therefore, the judge will have count[i] == n - 1.
 *
 * Time Complexity: O(n + trust.length)
 * Space Complexity: O(n)
 */

class Solution {
    public int findJudge(int n, int[][] trust) {

        int[] count = new int[n + 1];

        for(int[] vec : trust) {
            int u = vec[0];
            int v = vec[1];

            count[u]--;
            count[v]++;
        }

        for(int i = 1; i <= n; i++) {
            if(count[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}
