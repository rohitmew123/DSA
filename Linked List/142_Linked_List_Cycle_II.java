/*
Problem: LeetCode 142 - Linked List Cycle II

Approach:
- Use Floyd's Cycle Detection Algorithm.
- Use slow pointer moving one step and fast pointer moving
  two steps to detect whether a cycle exists.
- When slow and fast meet, a cycle is present.
- Reset another pointer (ptr) to the head.
- Move ptr and slow one step at a time.
- The node where they meet is the starting point of the cycle.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head == null ) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode ptr = head;


        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {

                while(ptr != slow) {
                    slow = slow.next;
                    ptr = ptr.next;

                }
                return ptr;
      
            }
            
        }
        return null;
        
    }
}
