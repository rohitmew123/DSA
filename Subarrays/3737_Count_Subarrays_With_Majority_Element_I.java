/*
LeetCode 3737 - Count Subarrays With Majority Element I

Approach:
1. Iterate through all possible subarrays.
2. Maintain count of target element.
3. Calculate current subarray length.
4. If target frequency > length/2, increment answer.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {

        int length = nums.length; 
        int count = 0;

        for(int i=0; i<length; i++) {
            
            int frequency = 0;

            for(int j=i; j<length; j++) {

                if(nums[j] == target) {
                    frequency++;

                }
                if(frequency > (j-i+1)/2) {
                    count++;

                }
            }
        }
        return count;
        
    }
}
