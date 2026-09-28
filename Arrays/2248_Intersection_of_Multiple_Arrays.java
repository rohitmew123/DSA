/*
 * LeetCode 2248 - Intersection of Multiple Arrays
 *
 * Problem:
 * Given a 2D integer array nums, return a sorted list of integers
 * that are present in every array of nums.
 *
 * Approach:
 * 1. Store all elements of the first array in a HashSet.
 * 2. For every remaining array:
 *    - Create a temporary HashSet containing its elements.
 *    - Use retainAll() to keep only the common elements.
 * 3. Convert the final HashSet into an ArrayList.
 * 4. Sort the result in ascending order.
 *
 * Time Complexity:
 * O(N + K log K)
 * where N is the total number of elements across all arrays
 * and K is the number of elements in the final intersection.
 *
 * Space Complexity:
 * O(M)
 * where M is the number of unique elements stored in the sets.
 */

class Solution {
    public List<Integer> intersection(int[][] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums[0].length; i++) {
            set.add(nums[0][i]);
        }

        for (int i = 1; i < nums.length; i++) {

            HashSet<Integer> currentSet = new HashSet<>();

            for (int j = 0; j < nums[i].length; j++) {
                currentSet.add(nums[i][j]);
            }

            set.retainAll(currentSet);
        }

        List<Integer> result = new ArrayList<>(set);

        Collections.sort(result);

        return result;
    }
}
