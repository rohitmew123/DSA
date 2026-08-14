/*
LeetCode 1137 - N-th Tribonacci Number

Problem:
The Tribonacci sequence is defined as:
T0 = 0
T1 = 1
T2 = 1

For n >= 3:
Tn = T(n-1) + T(n-2) + T(n-3)

Return the value of Tn.

Approach:
1. Handle the base cases for n = 0, 1, and 2.
2. Use three variables to store the previous three terms.
3. Calculate the next term by adding the previous three terms.
4. Shift the values forward after each iteration.
5. Return the required Tribonacci number.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int tribonacci(int n) {
        if(n==0) {
            return 0;
        }
        else if(n==1 || n==2) {
            return 1;
        }
        else {

            int firstTerm = 0;
            int secondTerm = 1;
            int thirdTerm = 1;

            for(int i=1; i<=n; i++) {
                int fourthTerm = firstTerm + secondTerm + thirdTerm;

                firstTerm = secondTerm;
                secondTerm = thirdTerm;
                thirdTerm = fourthTerm;
            }
            return firstTerm;
        }      
        
    }
}
