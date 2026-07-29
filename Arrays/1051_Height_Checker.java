/*
LeetCode 1051 - Height Checker

Problem:
Given an array heights representing the heights of students,
return the number of indices where the students are not standing
in the expected non-decreasing order.

Approach:
1. Create a copy of the original array.
2. Sort the copied array.
3. Compare both arrays element by element.
4. Count the indices where the elements differ.
5. Return the count.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

class Solution {
    public int heightChecker(int[] heights) {
        
       int result[] = new int[heights.length];


       for(int i=0; i<heights.length; i++) {
        result[i] = heights[i];

       }

       Arrays.sort(result);
       int count = 0;

       for(int i=0; i<heights.length; i++) {
        if(heights[i] != result[i]) {
            count++;
        }
       }
       return count;
        
    }
}
