/*
 * LeetCode 349 - Intersection of Two Arrays
 *
 * Approach:
 * Store all elements of nums1 in a HashSet.
 * Then traverse nums2 and check whether each element
 * exists in the HashSet.
 *
 * If an element is found, add it to the result array
 * and remove it from the HashSet so that duplicates
 * are not added to the answer.
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length];

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        int index = 0;

        for(int j = 0; j < nums2.length; j++) {

            if(set.contains(nums2[j])) {
                arr[index] = nums2[j];
                index++;

                set.remove(nums2[j]);
            }
        }

        return Arrays.copyOf(arr, index);
    }
}
