/*
Problem: LeetCode 328 - Odd Even Linked List

Approach:
- Use two pointers to separate odd-position and even-position nodes.
- oddHead handles the odd-position nodes.
- evenHead handles the even-position nodes.
- Store the starting node of the even list in evenStart.
- Rearrange the links to form separate odd and even lists.
- Connect the end of the odd list to the start of the even list.

Important:
- Odd and even refer to node positions, not node values.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode evenStart = evenHead;

        while(evenHead != null && evenHead.next != null) {
            oddHead.next = oddHead.next.next;
            evenHead.next = evenHead.next.next;

            oddHead = oddHead.next;
            evenHead = evenHead.next;

        }
        oddHead.next = evenStart;

        return head;
        
    }
}
