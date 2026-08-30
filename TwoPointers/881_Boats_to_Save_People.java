/*
LeetCode 881 - Boats to Save People

Problem:
Find the minimum number of boats needed to rescue all people.
Each boat can carry at most two people, and their total weight
must not exceed the given limit.

Approach:
1. Sort the people array.
2. Use two pointers: start and end.
3. Check the lightest and heaviest person.
4. If both can fit in one boat, move both pointers.
5. Otherwise, send the heaviest person alone.
6. Increase the boat count after every boat.

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);
        int start = 0;
        int end = people.length-1;
        
        int count = 0;

        while(start<=end) {
            
            if(people[start] + people[end] <= limit) {
                start++;
                end--;
            }
            else {
                end--;
            }
            
            count++;
        }

        return count;
        
    }
}
