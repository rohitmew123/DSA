/*
Problem: LeetCode 20 - Valid Parentheses

Approach:
- Use a Stack to store opening brackets.
- When a closing bracket is found, check whether it matches
  the bracket at the top of the stack.
- If it matches, pop the opening bracket.
- If it does not match or the stack is empty, return false.
- At the end, the stack must be empty for a valid string.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> ss = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') {
                ss.push(ch);
            } 
            else {
                if(ss.isEmpty()) {
                    return false;
                }
                else {
                    
                    if (  (ss.peek() == '(' && ch == ')') 
                    || (ss.peek() == '{' && ch == '}') 
                    || (ss.peek() == '[' && ch == ']')  ) {
                        ss.pop();
                    }
                    else {
                        return false;
                    }           
                    
                }
            }
        }
        if(ss.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
