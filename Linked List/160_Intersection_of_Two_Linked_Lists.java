/*
LeetCode 160 - Intersection of Two Linked Lists

Problem:
Given the heads of two singly linked lists, return the node
at which the two lists intersect. If the two linked lists have
no intersection, return null.

Approach:
1. Find the length of both linked lists.
2. Calculate the absolute difference between their lengths.
3. Move the pointer of the longer linked list ahead by 'diff' nodes.
4. Traverse both lists simultaneously.
5. If both pointers point to the same node, return that node.
6. If no intersection exists, both pointers become null.

Time Complexity: O(n + m)
Space Complexity: O(1)
*/

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode temp = headA;
        int length = 0;

        while(temp != null) {
            length++;
            temp = temp.next;
        }
       
        ListNode temp2 = headB;
        int length2 = 0;
        while(temp2 != null) {
            length2++;
            temp2 = temp2.next;
        }

        int diff = Math.abs(length - length2);

        if(length > length2) {
            while(diff > 0) {
                headA = headA.next;
                diff--;
            }

        } else {
            while(diff > 0) {
                headB = headB.next;
                diff--;
            }
        }
    
        while(headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
        
    }
}
