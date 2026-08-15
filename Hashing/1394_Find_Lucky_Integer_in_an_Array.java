/*
LeetCode 1394 - Find Lucky Integer in an Array

Problem:
Given an array of integers, find the largest lucky integer.

A lucky integer is a number whose value is equal to its frequency
in the array.

Approach:
1. Use a HashMap to store the frequency of each element.
2. Traverse the HashMap keys.
3. Check if the frequency of a number is equal to the number itself.
4. If multiple lucky integers exist, return the largest one.
5. If no lucky integer exists, return -1.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int findLucky(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            int ele = arr[i];

            if(map.containsKey(ele) == true) {
                map.put(ele, map.get(ele)+1);

            } else {
                map.put(ele,1);
            }
        }

        int ans = -1;

        for(int key : map.keySet()) {
            if(map.get(key) == key) {
                ans = Math.max(ans, key);

            }
        }
        return ans;
    }
}
