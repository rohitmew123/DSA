/*
LeetCode 240 - Search a 2D Matrix II

Approach (Optimal):
1. Start from the top-right corner of the matrix.
2. If the current element equals the target, return true.
3. If the current element is greater than the target, move left.
4. If the current element is smaller than the target, move down.
5. Continue until the target is found or the search goes out of bounds.

Time Complexity: O(m + n)
Space Complexity: O(1)
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix[0].length;
        int j = m-1;
        int i = 0;

        while(i<matrix.length && j >= 0) {

            if(matrix[i][j] == target) {
                return true;
            } 
            if(matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }

        }
        return false;
        
    }
}
