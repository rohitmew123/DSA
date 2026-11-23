
/*
 * LeetCode 852: Peak Index in a Mountain Array
 *
 * Approach:
 * Binary Search on the mountain array.
 * If arr[mid] < arr[mid + 1], we are on the
 * increasing slope, so search the right half.
 * Otherwise, search the left half including mid.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
