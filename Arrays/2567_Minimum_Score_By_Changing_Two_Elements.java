
class Solution {
    /*
     * Approach: Sorting + Greedy
     *
     * 1. Sort the array.
     * 2. Consider all three possible ways
     *    to modify two elements.
     * 3. Calculate the minimum possible
     *    difference among the three cases.
     *
     * Time Complexity: O(n log n)
     * Space Complexity: O(1) auxiliary
     */

    public int minimizeSum(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        return Math.min(
            nums[n-3] - nums[0],
            Math.min(
                nums[n-1] - nums[2],
                nums[n-2] - nums[1]
            )
        );
    }
}
