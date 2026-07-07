/*
LeetCode 1859 - Sorting the Sentence

Approach:
1. Split the sentence into individual words.
2. Extract the last character of each word to determine its correct position.
3. Convert the last character (digit) into an integer index.
4. Remove the last digit using substring() and place the word in the correct position.
5. Join all words with spaces and return the sorted sentence.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String sortSentence(String s) {
        String[] word = s.split(" ");
        String[] ans = new String[word.length];

        for(int i=0; i<word.length; i++){
            char [] ch = word[i].toCharArray();
           
            char last = ch[ch.length-1];
            int index = last - '0';
           
            ans[index-1] = word[i].substring(0, word[i].length()-1);
    
        }
        return String.join(" ", ans);
        
    }
}
