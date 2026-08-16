/*
LeetCode 66 - Plus One

Problem:
Given a large integer represented as an integer array,
where each element represents a digit, increment the integer by one
and return the resulting array.

Approach:
1. Check the last digit.
2. If it is not 9, increment it and return the array.
3. If it is 9, change it to 0 and carry the addition
   to the previous digits.
4. Traverse the array from right to left.
5. If a digit is not 9, increment it and return the array.
6. If all digits are 9, create a new array of size n + 1
   and set the first element to 1.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length; 

        if(digits[n-1] != 9) {
            digits[n-1] = digits[n-1]+1;
            return digits;
        }

        digits[n-1]=0;

        for(int i=n-2; i>=0; i--) {

            if(digits[i] != 9) {
                digits[i] = digits[i]+1;
                return digits;
            }
            digits[i] = 0;

        }
        int[] ans = new int[n+1];
        ans[0] = 1;
        return ans;
        
    }
}
