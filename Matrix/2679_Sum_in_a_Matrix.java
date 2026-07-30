/*
LeetCode 2679 - Sum in a Matrix

Problem:
You are given a 0-indexed 2D integer array nums. In one operation,
remove the greatest value from each row. Among the removed values,
add the greatest one to the answer. Repeat this process until the
matrix becomes empty.

Approach:
1. Sort each row in ascending order.
2. Traverse each column.
3. Find the maximum element in the current column.
4. Add the maximum value to the answer.
5. Return the final sum.

Time Complexity: O(m × n log n)
Space Complexity: O(1)
*/

class Solution {
    public int matrixSum(int[][] nums) {

        int row = nums.length;
        int col = nums[0].length;

        for(int i=0; i<row; i++) {
            Arrays.sort(nums[i]);
        }
        
        int sum = 0;

        for(int i=0; i < col; i++) {
            int max = Integer.MIN_VALUE;
            for(int j=0; j < row; j++) {
                
               max = Math.max(max, nums[j][i]);
                
            }
            sum = sum + max;
        }
        return sum; 
    }
}
