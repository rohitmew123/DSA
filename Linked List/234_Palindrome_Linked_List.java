/*
LeetCode 234 - Palindrome Linked List

Approach:
1. Handle the edge case for an empty or single-node linked list.
2. Find the middle of the linked list using the Fast and Slow Pointer technique.
3. Reverse the second half of the linked list.
4. Compare the first half with the reversed second half.
5. If all corresponding values match, return true; otherwise, return false.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null ) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head; 

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode midNode =  slow;
        
      
        ListNode prev = null;
        ListNode curr = midNode;
        ListNode next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode right = prev;
        ListNode left = head;

        while(right != null) {
            if(left.val != right.val) {
                return false;
            }
            
            left = left.next;
            right = right.next;
        }

        return true;
    }
}
