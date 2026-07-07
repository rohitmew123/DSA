/*
LeetCode 1346 - Check If N and Its Double Exist

Approach:
1. Use a HashSet to store the elements that have already been visited.
2. For each number, check whether its double already exists in the set.
3. If the current number is even, also check whether its half exists in the set.
4. If either condition is true, return true.
5. Otherwise, add the current number to the HashSet.
6. If no valid pair is found, return false.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for(int num : arr) {
            if(set.contains(2 * num) || (set.contains(num /2 ) && (num % 2) == 0)) {
                return true;
            }
            set.add(num);
        }
        return false;
        
    }
}
