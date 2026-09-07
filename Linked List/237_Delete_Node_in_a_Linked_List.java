/*
Problem: LeetCode 237 - Delete Node in a Linked List

Approach:
- Copy the value of the next node into the current node.
- Then skip the next node by connecting the current node
  to the node after it.
- This effectively deletes the given node without using
  the previous node.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
        
    }
}
