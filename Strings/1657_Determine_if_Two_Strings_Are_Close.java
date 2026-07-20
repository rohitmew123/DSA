/*
LeetCode 1657 - Determine if Two Strings Are Close

Approach:
1. If both strings have different lengths, return false.
2. Count the frequency of each character using two frequency arrays.
3. Verify that both strings contain the same set of unique characters.
4. Sort both frequency arrays.
5. Compare the sorted frequency arrays.
6. If both arrays are equal, return true; otherwise, return false.

Time Complexity: O(n + 26 log 26)
Space Complexity: O(26)
*/

class Solution {
    public boolean closeStrings(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        if(m != n) {
            return false;
        }

        int freq1[] = new int[26];
        int freq2[] = new int[26];

        for(int i=0; i<m; i++) {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);

            int idex1 = ch1 - 'a';
            int idex2 = ch2 - 'a';

            freq1[idex1]++;
            freq2[idex2]++;
        }

        for(int i=0; i<26; i++) {
            if(freq1[i] != 0 && freq2[i] != 0) 
            continue;

            if(freq1[i] == 0 && freq2[i] == 0 ) 
            continue;

            return false;
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
        
    }
}
