/*
LeetCode 75 - Sort Colors

Problem:
Given an array containing only 0, 1, and 2,
sort the array in-place without using the built-in sort function.

Approach:
1. Count the number of 0s, 1s, and 2s.
2. Traverse the array and update the respective counts.
3. Overwrite the array with all 0s first.
4. Then add all 1s.
5. Finally, add all 2s.
6. The array becomes sorted in ascending order.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void sortColors(int[] nums) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            }
            else if (nums[i] == 1) {
                count1++;
            }
            else {
                count2++;
            }
        }

        int index = 0;

        while (count0 > 0) {
            nums[index++] = 0;
            count0--;
        }

        while (count1 > 0) {
            nums[index++] = 1;
            count1--;
        }

        while (count2 > 0) {
            nums[index++] = 2;
            count2--;
        }
    }
}
