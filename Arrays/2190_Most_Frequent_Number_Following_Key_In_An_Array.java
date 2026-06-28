/*
LeetCode 2190 - Most Frequent Number Following Key In An Array

Approach:
1. Create a frequency array of size 1001.
2. Traverse the array and whenever the current element equals the key,
   increment the frequency of the next element.
3. Traverse the frequency array to find the number with the highest frequency.
4. Return that number.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int mostFrequent(int[] nums, int key) {
       int [] result = new int[1001];

       for(int i=0; i<nums.length-1; i++) { 

           if(nums[i] == key) {
               result[nums[i+1]]++;
            }

        }

        int ans = 0;
        for(int i=0; i<result.length; i++) {

            if(result[i] > result[ans]) {
                ans = i;
            }
        }
        return ans;
       
        
    }
}
