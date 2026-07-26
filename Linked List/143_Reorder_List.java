/*
Problem:
Reorder the linked list from:
L0 → L1 → L2 → ... → Ln
to:
L0 → Ln → L1 → Ln-1 → L2 → Ln-2 ...

Approach:
1. Find the middle of the linked list using Slow & Fast pointers.
2. Split the linked list into two halves.
3. Reverse the second half of the list.
4. Merge both halves alternately.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;

        ListNode curr = mid.next;
        mid.next = null;
        ListNode prev = null;
        ListNode next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode left = head;
        ListNode right = prev;
        ListNode nextL, nextR;

        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;

        }
        
    }
}
