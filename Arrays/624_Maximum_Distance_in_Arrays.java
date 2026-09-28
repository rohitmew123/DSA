/*
 * LeetCode 624 - Maximum Distance in Arrays
 *
 * Approach:
 * Since every array is sorted, its first element is the minimum
 * and its last element is the maximum.
 *
 * Maintain the minimum and maximum values seen from previous arrays.
 * For each current array, calculate:
 *
 * 1. current maximum - previous minimum
 * 2. previous maximum - current minimum
 *
 * Update the result with the maximum distance.
 * Then update the global minimum and maximum.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {

        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);

        int result = 0;

        for(int i = 1; i < arrays.size(); i++) {

            int currMin = arrays.get(i).get(0);
            int currMax = arrays.get(i).get(arrays.get(i).size() - 1);

            result = Math.max(result, Math.abs(currMax - min));
            result = Math.max(result, Math.abs(max - currMin));

            max = Math.max(max, currMax);
            min = Math.min(min, currMin);
        }

        return result;
    }
}
