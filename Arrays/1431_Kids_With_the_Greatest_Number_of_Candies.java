/*
 * LeetCode 1431 - Kids With the Greatest Number of Candies
 *
 * Approach:
 * First, find the maximum number of candies among all the kids.
 * Then, for each kid, check whether adding extraCandies
 * makes their candies greater than or equal to the maximum.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) for the result list
 */

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;

        for(int candy : candies) {
            max = Math.max(max, candy);
        }

        List<Boolean> result = new ArrayList<>();

        for(int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}
