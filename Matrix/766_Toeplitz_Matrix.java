/*
LeetCode 766 - Toeplitz Matrix

Approach:
1. Traverse the matrix starting from row 1 and column 1.
2. For each element, compare it with its top-left diagonal element.
3. If any pair is not equal, return false.
4. If all diagonal elements match, return true.

Time Complexity: O(m * n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++ ) {
                if(matrix[i][j] != matrix[i-1][j-1]) {
                    return false;
                }
            }
        }
        return true;
        
    }
}
