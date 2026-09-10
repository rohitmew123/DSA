/*
LeetCode 232 - Implement Queue using Stacks

Problem:
Implement a FIFO Queue using two Stacks.

Approach:
Use two stacks, s1 and s2.
During push, move all elements from s1 to s2,
insert the new element into s1, and then move all
elements back from s2 to s1.
This keeps the front element at the top of s1.

Time Complexity:
push()  -> O(n)
pop()   -> O(1)
peek()  -> O(1)
empty() -> O(1)

Space Complexity:
O(n)
*/

class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MyQueue() {
           
    }
    
    public void push(int x) {
        while(!s1.empty()) {
            s2.push(s1.pop());
        }
        s1.push(x);

        while(!s2.empty()) {
            s1.push(s2.pop());
        }
        
    }
    
    public int pop() {
        if(empty()) {
            return -1;
        }
        return s1.pop();
    }
    
    public int peek() {
        if(empty()) {
            return -1;

        }
        return s1.peek();
        
    }
    
    public boolean empty() {
        return s1.empty();
        
    }
}
