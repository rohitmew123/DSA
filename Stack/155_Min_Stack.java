/*
LeetCode 155 - Min Stack

Problem:
Design a stack that supports push, pop, top, and getMin operations.
The getMin operation should return the minimum element in O(1) time.

Approach:
1. Use two stacks: st and min.
2. st stores all the elements.
3. min stores the minimum elements encountered so far.
4. During push, add the value to min if it is smaller than
   or equal to the current minimum.
5. During pop, if the removed element is equal to the current
   minimum, remove it from the min stack as well.
6. getMin() returns the top element of the min stack.

Time Complexity:
push()   -> O(1)
pop()    -> O(1)
top()    -> O(1)
getMin() -> O(1)

Space Complexity: O(n)
*/

class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();  
    }
    
    public void push(int val) {
        if(st.size() == 0 ||  min.peek() >= val) {
            min.push(val);
        } 
        st.push(val);
        
    }
    
    public void pop() {
        int ele1 = st.pop();
        int ele2 = min.peek();

        if(ele1 == ele2) {
            min.pop();
        }
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return min.peek();
        
    }
}
