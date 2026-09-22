/*
 * LeetCode 540 - Single Element in a Sorted Array
 *
 * Approach:
 * Use Binary Search to find the element that appears only once.
 *
 * In a correctly paired part of the array, the first element
 * of every pair is at an even index. We make mid even and
 * compare nums[mid] with nums[mid + 1].
 *
 * If they form a pair, the single element is on the right.
 * Otherwise, the single element is on the left including mid.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int singleNonDuplicate(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while(left < right) {

            int mid = left + (right - left) / 2;

            if(mid % 2 == 1) {
                mid--;
            }

            if(nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } 
            else {
                right = mid;
            }
        }

        return nums[left];
    }
}
