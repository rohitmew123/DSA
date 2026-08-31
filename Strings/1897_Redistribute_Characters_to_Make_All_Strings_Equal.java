/*
LeetCode 1897 - Redistribute Characters to Make All Strings Equal

Problem:
Check whether the characters of all strings can be redistributed
so that every string becomes equal.

Approach:
1. Create a frequency array of size 26.
2. Count the frequency of every character from all strings.
3. For each character, check whether its total frequency
   is divisible by the number of strings.
4. If any frequency is not divisible, return false.
5. Otherwise, return true.

Time Complexity: O(N)
Space Complexity: O(1)
*/

class Solution {
    public boolean makeEqual(String[] words) {
        int[] fre = new int[26];

        for(int i=0; i<words.length; i++) {
            String w = words[i];

            for(int j=0; j< w.length(); j++) {
                char ch = w.charAt(j);
                int idx = (int)(ch-'a');

                fre[idx] = fre[idx]+1;
            }

        }

        for(int i=0; i<26; i++) {
            if(fre[i] % words.length != 0) {
                return false;
            }
        }
        return true;
        
    }
}
