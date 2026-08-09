/*
LeetCode 1512 - Number of Good Pairs

Problem:
Given an integer array nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Approach:
1. Create a frequency array to store the frequency of each number.
2. Traverse nums and increase the frequency of each number.
3. For each frequency, calculate the number of possible pairs using:
   count * (count - 1) / 2
4. Add all pairs to the result.
5. Return the total number of good pairs.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int numIdenticalPairs(int[] nums) {

        int res = 0;
        int countArray[] = new int[101];

        for(int num : nums) {
            countArray[num]++;
        }

        for(int count : countArray) {
            count = (count * (count - 1)) /2;
            res += count;
        }
        return res;
        
    }
}
