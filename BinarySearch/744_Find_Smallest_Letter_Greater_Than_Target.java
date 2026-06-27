/*
LeetCode 744 - Find Smallest Letter Greater Than Target

Approach:
1. Use Binary Search to find the first character greater than the target.
2. If current character is less than or equal to target, search the right half.
3. Otherwise, search the left half for a smaller valid answer.
4. Handle the circular condition using modulo.

Time Complexity: O(log n)
Space Complexity: O(1)
*/


class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int low = 0;
        int high = letters.length-1;

        while(low<=high) {

            int mid = low + (high-low) / 2;

            if(letters[mid] <= target) {
                low = mid+1;
            } 

            else {
                high = mid-1;
            }
            
        }

        return letters[low % letters.length];    
    }
}
