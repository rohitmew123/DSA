/*
LeetCode 2089 - Find Target Indices After Sorting Array

Approach:
1. Sort the given array.
2. Traverse the sorted array.
3. If the current element equals the target, store its index in the answer list.
4. Return the list of target indices.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            
            if(target == nums[i]) {
                list.add(i);
            }
        }
        return list;  

    }
}
