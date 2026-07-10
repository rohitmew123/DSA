/*
LeetCode 19 - Remove Nth Node From End of List

Approach:
1. Traverse the linked list to calculate its size.
2. If the node to remove is the head, update head to head.next.
3. Find the node just before the target node.
4. Skip the target node by updating the next pointer.
5. Return the head of the updated linked list.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }
        if(n == size) {
            head = head.next;
            return head;
        }
        int i=1;
        int iToFind = size - n;
        ListNode prev = head;

        while(i < iToFind) {
            prev = prev.next;
            i++;

        }
        prev.next = prev.next.next;
        return head;
 
        
    }
}
