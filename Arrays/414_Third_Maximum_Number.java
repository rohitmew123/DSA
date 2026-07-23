/*
Approach:
1. Sort the array in ascending order.
2. Store the maximum element.
3. Traverse the array from right to left.
4. Count only distinct elements by skipping duplicates.
5. Return the third distinct maximum if found.
6. Otherwise, return the maximum element.

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        int count = 1;
        int max = nums[nums.length-1];

        for(int i = nums.length-2; i >= 0; i--){

            if(nums[i] != nums[i+1]){
                count++;
            }

            if(count == 3){
                return nums[i];
            }
        }
    
        return max;  
    }
}
