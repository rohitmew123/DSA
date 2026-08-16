/*
LeetCode 1518 - Water Bottles

Problem:
Given numBottles full water bottles and numExchange empty bottles
required for one exchange, return the maximum number of water bottles
that can be drunk.

Approach:
1. Initially, drink all available full bottles.
2. Store the total number of bottles drunk in ans.
3. Use the empty bottles to exchange for new full bottles.
4. Calculate:
   - newBottles = numBottles / numExchange
   - remBottles = numBottles % numExchange
5. Add the new bottles to the answer.
6. After drinking the new bottles, they also become empty bottles.
7. Continue until there are not enough bottles for another exchange.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int ans = numBottles;

        while(numBottles >= numExchange) {

            int newBottles = numBottles / numExchange;

            int remBottles = numBottles % numExchange;

            ans = ans + newBottles;

            numBottles = newBottles + remBottles;
        }

        return ans;
        
    }
}
