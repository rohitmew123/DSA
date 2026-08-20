/*
LeetCode 876 - Middle of the Linked List

Problem:
Given the head of a singly linked list, return the middle node.
If there are two middle nodes, return the second middle node.

Approach:
1. Use two pointers: slow and fast.
2. slow moves one step at a time.
3. fast moves two steps at a time.
4. When fast reaches the end of the linked list,
   slow will be at the middle node.
5. Return slow.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
        
    }
}
