/*
LeetCode 1768 - Merge Strings Alternately

Approach:
1. Create a StringBuilder to store the result.
2. Use two pointers to traverse both strings.
3. Append one character from the first string, then one from the second string.
4. Continue until both strings are completely traversed.
5. Convert the StringBuilder to a String and return it.

Time Complexity: O(n + m)
Space Complexity: O(n + m)
*/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();

        int i = 0;
        int j = 0;

        while(i < word1.length() || j < word2.length()) {
            
            if(i<word1.length()) {
                ans.append(word1.charAt(i));
                i++;
            }

            if(j<word2.length() ) {
                ans.append(word2.charAt(j));
                j++;
            }
        }
        return ans.toString();
        
    }
}
