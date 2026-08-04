/*
LeetCode 203 - Remove Linked List Elements

Problem:
Given the head of a linked list and an integer val, remove all the
nodes of the linked list whose value is equal to val and return the
new head of the linked list.

Approach:
1. Create a dummy node and connect it to the head.
2. Use two pointers:
   - prev points to the previous node.
   - curr traverses the linked list.
3. If curr.val == val, skip the current node by updating prev.next.
4. Otherwise, move prev to curr.
5. Move curr to the next node in every iteration.
6. Return dummy.next as the new head.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while(curr != null) {
            
            if(curr.val == val) {
                prev.next = curr.next;    
            
            } else {
                prev = curr;
            }

            curr = curr.next;

        }
        return dummy.next;
        
    }
}
