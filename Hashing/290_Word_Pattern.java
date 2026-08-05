/*
LeetCode 290 - Word Pattern

Problem:
Given a pattern and a string s, determine if s follows the same pattern.
Each character in the pattern must map to exactly one unique word, and each
word must map to exactly one unique character.

Approach:
1. Split the string into words.
2. If the pattern length and number of words are different, return false.
3. Use a HashMap<Character, String> to store the character-to-word mapping.
4. If a word is already mapped to another character, return false.
5. If the current character already exists, verify that it maps to the same word.
6. Otherwise, add the new mapping to the HashMap.
7. If all mappings are valid, return true.

Time Complexity: O(n²)
Space Complexity: O(n)
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> hm = new HashMap<>();

        String[] arr = s.split(" ");

        if (pattern.length() != arr.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            boolean containsKey = hm.containsKey(ch);

            // Same word cannot be mapped to different characters
            if (hm.containsValue(arr[i]) && !containsKey) {
                return false;
            }

            if (containsKey) {
                if (!hm.get(ch).equals(arr[i])) {
                    return false;
                }
            } else {
                hm.put(ch, arr[i]);
            }
        }

        return true;
    }
}
