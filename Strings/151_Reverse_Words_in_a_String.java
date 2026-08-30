/*
LeetCode 151 - Reverse Words in a String

Problem:
Reverse the order of words in a given string.
Remove extra spaces from the beginning, end, and between words.

Approach:
1. Split the string into words using "\\s+".
2. Traverse the words from right to left.
3. Append each word to a StringBuilder.
4. Add a space after each word.
5. Use trim() to remove the extra space at the beginning or end.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");

        StringBuilder sb = new StringBuilder("");

        for(int i=arr.length-1; i>=0; i--) {
            sb.append(arr[i] + " ");
        }

        String ans = sb.toString();
        ans = ans.trim();

        return ans;
        
    }
}
