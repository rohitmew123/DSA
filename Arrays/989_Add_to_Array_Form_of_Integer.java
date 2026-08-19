/*
LeetCode 989 - Add to Array-Form of Integer

Problem:
Given an integer array representing a number and an integer k,
add k to the number and return the result as an array-form integer.

Approach:
1. Start from the last digit of the array.
2. Extract the last digit of k using k % 10.
3. Add the array digit, k digit, and carry.
4. Store the last digit of the sum in the answer list.
5. Update the carry and move to the previous digit.
6. Continue until both the array and k are processed.
7. Add any remaining carry.
8. Reverse the answer because digits are added from right to left.

Time Complexity: O(n + log k)
Space Complexity: O(n + log k)
*/

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> ans = new ArrayList<>();

        int p = num.length-1;
        int carry = 0;

        while( p>=0 || k>0 ) {
            int numval = 0;

            if(p>=0) {
                numval = num[p];
            }

            int d = k % 10;

            int sum = numval + d + carry ;

            int digit = sum % 10;
            carry = sum / 10;

            ans.add(digit);

            p--;
            k = k / 10;

        }
        if(carry>0) {
            ans.add(carry);
        }

        Collections.reverse(ans);
        
        return ans;
        
    }
}
