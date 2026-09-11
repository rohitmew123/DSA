/*
LeetCode 2095 - Delete the Middle Node of a Linked List

Problem:
Delete the middle node of a singly linked list.

Approach:
Use slow and fast pointers.
The slow pointer moves one step while the fast pointer
moves two steps. The prev pointer keeps track of the node
before slow. When fast reaches the end, slow points to the
middle node, which can be deleted using prev.

Time Complexity:
O(n)

Space Complexity:
O(1)
*/

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next ==  null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;

        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = prev.next.next;

        return head;
          
    }
}
