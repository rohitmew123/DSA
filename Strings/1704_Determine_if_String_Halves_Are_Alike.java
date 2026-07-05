/*
LeetCode 1704 - Determine if String Halves Are Alike

Approach:
1. Divide the string into two equal halves.
2. Use two pointers to traverse both halves simultaneously.
3. Count the number of vowels in each half.
4. Compare both counts and return true if they are equal, otherwise return false.

Time Complexity: O(n)
Space Complexity: O(1)
*/


class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n/2;

        int i = 0; 
        int j = mid;

        int countL = 0;
        int countR = 0;

        while(i < mid && j < n) {

            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' || ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ) {  

                countL++;
            }

            char chh = s.charAt(j);
            if(chh == 'a' || chh == 'e' ||chh == 'i' ||chh == 'o' ||chh == 'u' || chh == 'A' ||chh == 'E' ||chh == 'I' ||chh == 'O' ||chh == 'U') {
                
                countR++;
            }

            i++;
            j++;
        
        }

        return countL == countR;
     
    }
}
