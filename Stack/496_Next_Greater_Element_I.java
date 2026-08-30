/*
LeetCode 496 - Next Greater Element I

Problem:
For each element in nums1, find the next greater element
of that element in nums2.

Approach:
1. Use a Monotonic Stack to find the next greater element
   for every element in nums2.
2. Traverse nums2 from right to left.
3. Remove elements from the stack that are smaller than
   or equal to the current element.
4. If the stack is empty, the next greater element is -1.
5. Otherwise, the top of the stack is the next greater element.
6. Store these results in nextGreater[].
7. Find each nums1 element in nums2 and use its corresponding
   next greater element.

Time Complexity: O(n + m²)
Space Complexity: O(m)
*/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int ans[] = new int[nums1.length];

        Stack<Integer> s = new Stack<>();

        int nextGreater[] = new int[nums2.length];

        for(int i = nums2.length - 1; i >= 0; i--) {

            while(!s.isEmpty() && nums2[s.peek()] <= nums2[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                nextGreater[i] = -1;
            }
            else {
                nextGreater[i] = nums2[s.peek()];
            }

            s.push(i);
        }

        for(int i = 0; i < nums1.length; i++) {

            for(int j = 0; j < nums2.length; j++) {

                if(nums1[i] == nums2[j]) {
                    ans[i] = nextGreater[j];
                    break;
                }
            }
        }

        return ans;
    }
}
