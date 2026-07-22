/*
LeetCode 148 - Sort List

Approach:
1. If the list has 0 or 1 node, return it.
2. Find the middle node using Slow and Fast pointers.
3. Split the linked list into two halves.
4. Recursively sort both halves using Merge Sort.
5. Merge the two sorted linked lists.
6. Return the head of the merged sorted list.

Time Complexity: O(n log n)
Space Complexity: O(log n)   // Recursive call stack
*/

class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        ListNode mid = slow;

        ListNode rightHead = mid.next;
        mid.next = null;

        ListNode newLeft = sortList(head);
        ListNode newRight = sortList(rightHead);

        ListNode mergeLL = new ListNode(-1);
        ListNode temp = mergeLL;

        while(newLeft != null && newRight != null) {
            if(newLeft.val <= newRight.val) {
                temp.next = newLeft;
                newLeft = newLeft.next;
                temp = temp.next;
            } else {
                temp.next = newRight;
                newRight = newRight.next;
                temp = temp.next;
            }
        }

        while(newLeft != null ) {
            temp.next = newLeft;
            newLeft = newLeft.next;
            temp = temp.next;
        }
        while(newRight != null) {
            temp.next = newRight;
            newRight = newRight.next;
            temp = temp.next;
        }
        return mergeLL.next;
 
    }
}
