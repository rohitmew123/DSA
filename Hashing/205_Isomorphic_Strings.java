/*
LeetCode 205 - Isomorphic Strings

Problem:
Given two strings s and t, determine whether they are isomorphic.

Two strings are isomorphic if characters in s can be replaced
to get t while maintaining a one-to-one mapping.

Approach:
1. Create a HashMap to store character mappings.
2. Traverse both strings using the same index.
3. If a character from s already exists in the map,
   check whether it maps to the current character in t.
4. If the mapping is different, return false.
5. If the character is new, check that the character from t
   is not already mapped to another character.
6. Store the new mapping.
7. If all mappings are valid, return true.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map.containsKey(ch1)) {

                if (map.get(ch1) != ch2) {
                    return false;
                }

            } else {

                if (map.containsValue(ch2)) {
                    return false;
                }

                map.put(ch1, ch2);
            }
        }

        return true;
    }
}
