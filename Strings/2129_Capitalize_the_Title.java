/*
LeetCode 2129 - Capitalize the Title

Approach:
1. Split the title into individual words.
2. Traverse each word.
3. If the word length is less than or equal to 2, convert the entire word to lowercase.
4. Otherwise, convert the word to lowercase, capitalize the first character, and append the remaining substring.
5. Join all processed words with spaces and return the final string.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String capitalizeTitle(String title) {

        String[] word = title.split(" ");

        for(int i=0; i<word.length; i++) {

            if(word[i].length() <=2) {
                word[i] = word[i].toLowerCase();

            } else {
                word[i] = word[i].toLowerCase();
                char first = word[i].charAt(0);
                first= Character.toUpperCase(first);
                String rem = word[i].substring(1);
                word[i] = first + rem ;
                
            }
        }
        return String.join(" ", word);
        
    }
}
