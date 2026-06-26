/*
LeetCode 680 - Valid Palindrome II

Approach:
1. Use two pointers (left and right).
2. Move both pointers inward while characters match.
3. On the first mismatch, try skipping either the left or the right character.
4. Use a helper function to check if the remaining substring is a palindrome.
5. If either check succeeds, return true; otherwise, return false.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public boolean check (String s, int left , int right) {

        while(left < right) {

            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;

            } else {
                return false;

            }
        }
        return true;
    }

    public boolean validPalindrome(String s) {

       int left = 0;
       int right = s.length() - 1;

       while(left < right) {

            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;

            }  else {
                
                return  check(s, left+1, right) || check(s, left, right-1);

            }
       }

       return true;    

    }
}
