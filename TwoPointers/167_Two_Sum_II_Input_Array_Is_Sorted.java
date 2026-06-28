/*
LeetCode 167 - Two Sum II - Input Array Is Sorted

Approach:
1. Use two pointers: one at the beginning and one at the end.
2. Calculate the current sum.
3. If the sum equals the target, return the 1-based indices.
4. If the sum is smaller than the target, move the left pointer.
5. Otherwise, move the right pointer.

Time Complexity: O(n)
Space Complexity: O(1)
*/


class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp = 0;
        int rp = numbers.length-1; 

        while(lp < rp) {

            int sum = numbers[lp]+numbers[rp];
            if(sum == target) {
                return new int[] {lp+1, rp+1};
            }

            if(sum < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return new int[]{-1, -1};
        
    }
}
