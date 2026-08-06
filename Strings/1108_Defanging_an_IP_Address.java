/*
LeetCode 1108 - Defanging an IP Address

Problem:
Given a valid IPv4 address, return a defanged version of the address
by replacing every '.' with "[.]".

Approach:
1. Create a StringBuilder to store the result.
2. Traverse each character of the input string.
3. If the character is '.', append "[.]".
4. Otherwise, append the character itself.
5. Return the final string.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String defangIPaddr(String address) {

        StringBuilder sb = new StringBuilder();
        char chars[] = address.toCharArray();

        for(char ch : chars) {
            if(ch == '.') {
                sb.append("[.]");
            }
            else {
                sb.append(ch);
            }
        }
        return sb.toString();
        
    }
}
