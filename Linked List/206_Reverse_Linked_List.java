/*
LeetCode 206 - Reverse Linked List

Problem:
Given the head of a singly linked list, reverse the list
and return the new head.

Approach:
1. Initialize three pointers:
   - prev = null
   - curr = head
   - next = null
2. Traverse the linked list.
3. Store the next node.
4. Reverse the current node's pointer.
5. Move prev and curr one step forward.
6. After the traversal, prev becomes the new head.
7. Return prev.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr  = head;
        ListNode next;
       
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        head = prev;
        return head;
        
    }
}
