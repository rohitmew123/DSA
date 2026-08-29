/*
LeetCode 225 - Implement Stack using Queues

Problem:
Implement a stack using queue(s) and support push, pop, top,
and empty operations.

Approach:
1. Use two queues: main and helper.
2. Move all elements from main to helper.
3. Add the new element to main.
4. Move all elements back from helper to main.
5. This keeps the newest element at the front of main.
6. Therefore, pop() and top() work like a stack.

Time Complexity:
push()  -> O(n)
pop()   -> O(1)
top()   -> O(1)
empty() -> O(1)

Space Complexity: O(n)
*/

class MyStack {
    private Queue<Integer> main;
    private Queue<Integer> helper;

    public MyStack() {
        main = new LinkedList<>();
        helper = new LinkedList<>();
        
    }
    
    public void push(int x) {
        
        while(main.size() > 0) {
            helper.add(main.remove());
        }

        main.add(x);

        while(helper.size() > 0) {
            main.add(helper.remove());
        }   
    }
    
    public int pop() {
        return main.remove();
        
    }
    
    public int top() {
        return main.peek();
        
    }
    
    public boolean empty() {
        if(main.size() == 0) {
            return true;

        } else {
            return false;

        }
        
    }
}
