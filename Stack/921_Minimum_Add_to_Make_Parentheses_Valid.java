/*
LeetCode 921 - Minimum Add to Make Parentheses Valid

Problem:
Find the minimum number of parentheses that must be added
to make the given parentheses string valid.

Approach:
1. Use a Stack to store opening parentheses '('.
2. If '(' is encountered, push it into the stack.
3. If ')' is encountered and a matching '(' is present,
   pop the opening parenthesis.
4. If ')' has no matching '(', increment count because
   an opening '(' needs to be added.
5. At the end, the remaining '(' in the stack need matching
   ')' parentheses.
6. Return stack size + count.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int minAddToMakeValid(String s) {

        Stack<Character> st = new Stack<>();

        int count = 0;

        for(int i=0; i<s.length(); i++) {

            char ch = s.charAt(i);

            if(ch == '(') {
                st.push(ch);
            }
            else if(st.size() > 0 && st.peek() == '(') {
                st.pop();
            }
            else {
                count++;
            }
        }

        return st.size() + count;
        
    }
}
