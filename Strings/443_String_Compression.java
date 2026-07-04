/*
LeetCode 443 - String Compression

Approach:
1. Traverse the character array and count consecutive occurrences of each character.
2. Write the current character into the same array.
3. If the count is greater than 1, convert the count to a string.
4. Store each digit of the count back into the array.
5. Return the length of the compressed array.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int compress(char[] chars) {

        int n = chars.length;
        int index = 0;
        int i=0;

        while(i < n) {
            char curr_char = chars[i];
            int count = 0;

            while(i < n && chars[i] == curr_char) {
                count++;
                i++;

            }
            chars[index] = curr_char;
            index++;

            if(count > 1) {
                String count_str = Integer.toString(count);
                for(char ch : count_str.toCharArray()) {
                    chars[index] = ch;
                    index++;
                }
            }
        }
        return index;
          
    }
}
