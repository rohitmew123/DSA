/*
LeetCode 2418 - Sort the People

Approach:
1. Store each person's height and corresponding name in a HashMap.
2. Copy the heights into an Integer array.
3. Sort the heights in descending order using Collections.reverseOrder().
4. Traverse the sorted heights and retrieve the corresponding names from the HashMap.
5. Store the names in the answer array and return it.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();

        for(int i=0; i<heights.length; i++) {
            map.put(heights[i], names[i]);
        }

        Integer[] arr = new Integer[heights.length];
        for(int i=0; i<arr.length; i++) {
            arr[i] = heights[i];
        }

        Arrays.sort(arr, Collections.reverseOrder());

        String[] ans = new String[names.length];
        for(int j=0; j<arr.length; j++) {
            ans[j] = map.get(arr[j]);
        }
        
        return ans;
  
        
    }
}
