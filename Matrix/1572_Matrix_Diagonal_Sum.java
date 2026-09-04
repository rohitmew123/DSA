/*
LeetCode 1572 - Matrix Diagonal Sum

Problem:
Find the sum of both the primary and secondary diagonals
of a square matrix.

Approach:
1. Traverse the matrix using a single loop.
2. Add the primary diagonal element mat[i][i].
3. Add the secondary diagonal element mat[i][n-1-i].
4. If both diagonals meet at the center, add the center
   element only once.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int diagonalSum(int[][] mat) {

        int sum = 0;
        int n = mat.length;

        for(int i = 0; i < n; i++) {

            sum += mat[i][i];

            if(i != n - 1 - i) {
                sum += mat[i][n - 1 - i];
            }
        }

        return sum;
    }
}
