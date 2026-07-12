/*
LeetCode 141 - Linked List Cycle

Approach:
1. Initialize two pointers, slow and fast, at the head.
2. Move slow by one step and fast by two steps.
3. If both pointers meet at the same node, a cycle exists.
4. If fast reaches the end of the list, no cycle exists.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
            
        }
        return false;
        
    }
}
