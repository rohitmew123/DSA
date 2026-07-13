/*
LeetCode 976 - Largest Perimeter Triangle

Approach:
1. Sort the array in ascending order.
2. Start checking from the three largest sides.
3. If the sum of the two smaller sides is greater than the largest side,
   a valid triangle is formed.
4. Return the perimeter of the first valid triangle found.
5. If no valid triangle exists, return 0.

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
   
        for(int i = n-3; i>=0; i--) {
            if(nums[i] + nums[i+1] > nums[i+2]) {
                return nums[i] + nums[i+1] + nums[i+2];
            }
        }
        return 0;
    
    }
}
