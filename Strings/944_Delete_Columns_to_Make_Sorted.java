/*
LeetCode 944 - Delete Columns to Make Sorted

Approach:
1. Traverse each column of the string array.
2. Compare the current row's character with the previous row's character in the same column.
3. If any character is smaller than the one above it, the column is unsorted.
4. Increment the deletion count and move to the next column.
5. Return the total number of columns to be deleted.

Time Complexity: O(n × m)
Space Complexity: O(1)
*/

class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        int n = strs.length;

        int k = strs[0].length();

        for(int i=0; i<k; i++) {
            for(int j=1; j<n; j++) {
                if(strs[j].charAt(i) < strs[j-1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;     
    }
}
