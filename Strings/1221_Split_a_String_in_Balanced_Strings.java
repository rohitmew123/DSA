/*
LeetCode 1221 - Split a String in Balanced Strings

Problem:
A balanced string has an equal number of 'L' and 'R' characters.
Given a balanced string s, split it into the maximum number of
balanced substrings and return the maximum count.

Approach:
1. Traverse the string from left to right.
2. Count the number of 'L' and 'R' characters.
3. Whenever both counts become equal, one balanced substring is found.
4. Increment the answer and continue traversing.
5. Return the total number of balanced substrings.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int balancedStringSplit(String s) {

        if(s == null || s.length() == 0) {
            return 0;
        }

        int left = 0, right = 0, count = 0;

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == 'L') {
                left++;
            } 
            else {
                right++;
            }

            if(left == right) {
                count++;
            }
        }
        return count;    
    }
}
