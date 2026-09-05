/*
Problem: LeetCode 48 - Rotate Image

Approach:
- First, transpose the matrix by swapping matrix[i][j]
  with matrix[j][i].
- Then, reverse every row of the matrix.
- Transpose + reverse each row rotates the matrix
  90 degrees clockwise in-place.

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i=0; i<n; i++) {

            for(int j=i; j<n; j++) {
                
                int k = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = k;

            }
        }

        for(int i=0; i<matrix.length; i++) {
            int[] tempArr = matrix[i];

            reverse(tempArr);
        }
        return;
        
    }

    public void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int k = arr[start];
            arr[start] = arr[end];
            arr[end] = k;

            start++;
            end--;
        }
    }
}
