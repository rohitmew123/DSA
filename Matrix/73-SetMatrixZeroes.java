/*
LeetCode 73 - Set Matrix Zeroes

Approach:
1. Use the first row and first column as markers.
2. Traverse the matrix and whenever a 0 is found,
   mark its row and column by setting the first element
   of that row and column to 0.
3. Use the markers to set the corresponding cells to 0.
4. Handle the first row and first column separately
   because they are being used as markers.
5. Return the modified matrix.

Time Complexity: O(m * n)
Space Complexity: O(1)
*/

class Solution {
    public void setZeroes(int[][] matrix) {

        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {

                if(matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for(int i=0; i< matrix.length; i++) {

            for(int j=0; j<matrix[0].length; j++) {

                if(rows.contains(i) || cols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

        
    }
}
