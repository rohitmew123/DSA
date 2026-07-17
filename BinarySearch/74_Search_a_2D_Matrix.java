/*
LeetCode 74 - Search a 2D Matrix

Approach (Brute Force):
1. Traverse every element of the matrix using nested loops.
2. Compare each element with the target.
3. If the target is found, return true.
4. If the entire matrix is traversed without finding the target, return false.

Time Complexity: O(m × n)
Space Complexity: O(1)
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {

                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
        
    }
}
