/*
LeetCode 1684 - Count the Number of Consistent Strings

Problem:
You are given a string allowed consisting of distinct characters and
an array of strings words.
A string is consistent if all its characters appear in allowed.
Return the number of consistent strings.

Approach:
1. Store all characters of the allowed string in a HashSet.
2. Traverse each word.
3. Check every character of the word:
   - If a character is not present in the HashSet, mark the word as inconsistent and stop checking it.
4. If the word is consistent, increment the counter.
5. Return the total count.

Time Complexity: O(n × m)
Space Complexity: O(k)

Where:
n = number of words
m = average length of a word
k = number of distinct characters in allowed
*/

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;

        HashSet<Character> set = new HashSet<Character>();

        for(int i=0; i<allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }

        for(String str: words) {
            
            boolean flag = true;
            for(int i=0; i<str.length(); i++) {

                if(!set.contains(str.charAt(i))) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                counter++;
            }    
            
        }
        return counter;
        
    }
}
