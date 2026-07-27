/*
LeetCode 448 - Find All Numbers Disappeared in an Array

Problem:
Given an integer array nums of size n where each integer is in the range [1, n].
Some elements appear twice and others appear once.
Return all the numbers in the range [1, n] that do not appear in the array.

Approach:
1. Sort the array in ascending order.
2. Use two pointers:
   - i represents the expected number from 1 to n.
   - j traverses the sorted array.
3. If nums[j] == i, move both pointers.
4. If nums[j] < i, skip the duplicate by moving j.
5. If nums[j] > i, the number i is missing, so add it to the answer.
6. Add any remaining missing numbers after the traversal.

Time Complexity: O(n log n)
Space Complexity: O(1) (excluding the output list)
*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;
        int i = 1;
        int j = 0;

        while (i <= n && j < n) {

            if (nums[j] == i) {
                i++;
                j++;
            }
            else if (nums[j] < i) {
                j++;
            }
            else {
                list.add(i);
                i++;
            }
        }

        while (i <= n) {
            list.add(i);
            i++;
        }

        return list;
    }
}
